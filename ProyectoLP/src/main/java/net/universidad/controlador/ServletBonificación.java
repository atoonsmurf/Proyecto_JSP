package net.universidad.controlador;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.universidad.dao.MySqlBonificaci�nDAO;
import net.universidad.entidad.Bonificaci�n;
import net.universidad.services.Bonificaci�nService;
@WebServlet("/ServletBonificaci�n")
public class ServletBonificaci�n extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletBonificaci�n() {
        super();
    }

    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String codt,fecha,detalle,estado;
		codt=request.getParameter("codTrabajador");
		fecha=request.getParameter("fecha");
		detalle=request.getParameter("detalle");
		estado=request.getParameter("estado");
		
		Bonificaci�n bean=new Bonificaci�n();
		
		bean.setCodTrabajador(Integer.parseInt(codt));
		bean.setFecha(fecha);
		bean.setDetalle(detalle);
		bean.setEstado(estado);

		int salida;
		salida=new MySqlBonificaci�nDAO().grabarBonificaci�n(bean);
		
		if(salida>0)
			request.setAttribute("MENSAJE", "Bonificaci�n registrada correctamente!");
		else
			request.setAttribute("MENSAJE", "Error al grabar Bonificaci�n");
		
		//direccionar a la p�gina edificio.jsp
		request.getRequestDispatcher("/Bonificaci�n.jsp").forward(request, response);
	}
    	
    	protected void service1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String cod,codt,fecha,detalle,estado;
    		int salida;
    		cod=request.getParameter("codigo");
    		codt=request.getParameter("codTrabajador");
    		fecha=request.getParameter("fecha");
    		detalle=request.getParameter("detalle");
    		estado=request.getParameter("estado");
    		
    		Bonificaci�n bean=new Bonificaci�n();
    		
    		bean.setCodTrabajador(Integer.parseInt(codt));
    		bean.setFecha(fecha);
    		bean.setDetalle(detalle);
    		bean.setEstado(estado);
    		salida=new Bonificaci�nService().actualizarBonificaci�n(bean,(Integer.parseInt(cod)));
    		if(salida>0) 
    			request.setAttribute("MENSAJE","Bonificaci�n actualizada correctamente");
    		else
    			request.setAttribute("MENSAJE","Error al actualizar Bonificaci�n");
    		
    		request.getRequestDispatcher("/Bonificaci�n.jsp").forward(request, response);
    	}
    	
    	protected void service2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String cod;
    		int salida;
    		cod=request.getParameter("codigo");
    		salida=new Bonificaci�nService().eliminarBonificaci�n(Integer.parseInt(cod));
    		if(salida>0) 
    			request.setAttribute("MENSAJE","Bonificaci�n eliminada correctamente");
    		else
    			request.setAttribute("MENSAJE","Error al eliminar Bonificaci�n");
    		
    		request.getRequestDispatcher("/Bonificaci�n.jsp").forward(request, response);
    	}

}
