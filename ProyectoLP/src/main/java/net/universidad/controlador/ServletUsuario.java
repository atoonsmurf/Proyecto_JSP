package net.universidad.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.universidad.entidad.Menu;
import net.universidad.entidad.Usuario;
import net.universidad.services.UsuarioService;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	private UsuarioService gUsuario;
    public ServletUsuario() {
        super();
        
        gUsuario= new UsuarioService();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tipo;
		
		tipo= request.getParameter("ACCION");
		
		if(tipo.equals("INICIAR")) {
			iniciar(request,response);
		}else if(tipo.equals("CERRAR"))
			cerrar(request,response);
	
	}

	private void cerrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session = request.getSession();
		
		session.invalidate();
	request.setAttribute("MENSAJE", "Sesión cerrada exitosamente");
	request.getRequestDispatcher("/login.jsp").forward(request, response);
		
	}

	private void iniciar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//leer cajas
				String vLogin,vClave;
				vLogin= request.getParameter("login");
				vClave=request.getParameter("clave");
				
				//invocar al metodo inciarlogin
				
				Usuario bean= gUsuario.login_iniciar(vLogin, vClave);
				
				if(bean==null) {
					request.setAttribute("MENSAJE", "Usuario y/o clave incorrecto");
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
				else {
					List<Menu> listado= gUsuario.traer_menus(bean.getCodigo());
					HttpSession session= request.getSession();
					session.setAttribute("MENUS", listado);
					session.setAttribute("DATOS", bean.getApellidos() +" "+ bean.getNombres());
					request.getRequestDispatcher("/menu.jsp").forward(request, response);
				}
			}

}
