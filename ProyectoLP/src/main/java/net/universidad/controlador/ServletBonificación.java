package net.universidad.controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universidad.dao.MySqlBonificaciónDAO;
import net.universidad.entidad.Bonificación;
import net.universidad.services.BonificaciónService;
@WebServlet("/ServletBonificación")
public class ServletBonificación extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletBonificación() {
        super();
    }

    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String codt,fecha,detalle,estado;
		codt=request.getParameter("codTrabajador");
		fecha=request.getParameter("fecha");
		detalle=request.getParameter("detalle");
		estado=request.getParameter("estado");
		
		Bonificación bean=new Bonificación();
		
		bean.setCodTrabajador(Integer.parseInt(codt));
		bean.setFecha(fecha);
		bean.setDetalle(detalle);
		bean.setEstado(estado);

		int salida;
		salida=new MySqlBonificaciónDAO().grabarBonificación(bean);
		
		if(salida>0)
			request.setAttribute("MENSAJE", "Bonificación registrada correctamente!");
		else
			request.setAttribute("MENSAJE", "Error al grabar Bonificación");
		
		//direccionar a la página edificio.jsp
		request.getRequestDispatcher("/Bonificación.jsp").forward(request, response);
	}
    	
    	protected void service1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String cod,codt,fecha,detalle,estado;
    		int salida;
    		cod=request.getParameter("codigo");
    		codt=request.getParameter("codTrabajador");
    		fecha=request.getParameter("fecha");
    		detalle=request.getParameter("detalle");
    		estado=request.getParameter("estado");
    		
    		Bonificación bean=new Bonificación();
    		
    		bean.setCodTrabajador(Integer.parseInt(codt));
    		bean.setFecha(fecha);
    		bean.setDetalle(detalle);
    		bean.setEstado(estado);
    		salida=new BonificaciónService().actualizarBonificación(bean,(Integer.parseInt(cod)));
    		if(salida>0) 
    			request.setAttribute("MENSAJE","Bonificación actualizada correctamente");
    		else
    			request.setAttribute("MENSAJE","Error al actualizar Bonificación");
    		
    		request.getRequestDispatcher("/Bonificación.jsp").forward(request, response);
    	}
    	
    	protected void service2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String cod;
    		int salida;
    		cod=request.getParameter("codigo");
    		salida=new BonificaciónService().eliminarBonificación(Integer.parseInt(cod));
    		if(salida>0) 
    			request.setAttribute("MENSAJE","Bonificación eliminada correctamente");
    		else
    			request.setAttribute("MENSAJE","Error al eliminar Bonificación");
    		
    		request.getRequestDispatcher("/Bonificación.jsp").forward(request, response);
    	}

}
