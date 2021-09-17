package net.universidad.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.universidad.entidad.SolicitudC;
import net.universidad.services.SolicitudService;

@WebServlet("/ServletSolicitud")
public class ServletSolicitud extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//declara objeto de la clase SolicitudService
	private SolicitudService sSolicitud;
	
    public ServletSolicitud() {
        super();
        //crear objeto sSolicitud
        sSolicitud=new SolicitudService();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//leer el atributo que viene de la pagina Solicitud.jsp
		String tipo=request.getParameter("ACCION");
		//evaluar
		if(tipo.equals("LISTAR"))
			listado(request,response);
		else if(tipo.equals("GUARDAR"))
			guardar(request,response);
		else if(tipo.equals("ELIMINAR"))
			eliminar(request,response);
	}


	private void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//leer caja codigoEliminar
		String nroSoli;
		nroSoli=request.getParameter("nroEliminar");
		
		//invocar al mètodo delete
		int salida;
		salida=sSolicitud.eliminar(Integer.parseInt(nroSoli));
		//validar salida
		if(salida>0) {// SE ELIMINO CORRECTAMENTE
			//crear un atributo MENSAJE
			request.setAttribute("MENSAJE","Solicitud eliminada");
		}
		else {// ERROR AL ELIMINAR
			request.setAttribute("MENSAJE","Error al eliminar Solicitud");
		}
		listado(request,response);
	}


	private void guardar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PASO 1: leer controles(cajas y select) usar el atributo name
// =======
		String nroSoli,codTrab,fecha,descripcion,duracion;
		nroSoli=request.getParameter("nroSoli");
		codTrab=request.getParameter("codTrab");
		fecha=request.getParameter("fecha");
		descripcion=request.getParameter("descripcion");
		duracion=request.getParameter("duracion");
		//PASO 2: crear objeto de la clase Solicitud
		SolicitudC bean=new SolicitudC();
		//PASO 3: asignar valor a los atributos del objeto "bean" con las variables
		bean.setNroSoli(Integer.parseInt(nroSoli));
		bean.setCodTrab(Integer.parseInt(codTrab));
		bean.setFecha(fecha);
		bean.setDescripcion(descripcion);
		bean.setDuracion(duracion);
		//PASO 4: validar atributo codigo
		if(bean.getNroSoli()==0) {//INSERTTTTTTTTTTTTTT
			//invocar al metodo save
			int salida;
			salida=sSolicitud.agregar(bean);
			//validar salida
			if(salida>0) {// SE INSERTO CORRECTAMENTE
				//crear un atributo MENSAJE
				request.setAttribute("MENSAJE","Solicitud registrada");
			}
			else {// ERROR AL INSERTAR
				request.setAttribute("MENSAJE","Error en el registro de Solicitud");
			}
		}
		else {//UPDATE
			//invocar al metodo update
			int salida;
			salida=sSolicitud.actualizar(bean);
			//validar salida
			if(salida>0) {// SE ACTUALIZO CORRECTAMENTE
				request.setAttribute("MENSAJE","Solicitud actualizado");
			}
			else {// ERROR AL ACTUALIZAR
				request.setAttribute("MENSAJE","Error al actualizar Solicitud");
			}
		}
		listado(request,response);
		
	}


	private void listado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//invocar al método listAll
		List<SolicitudC> data=sSolicitud.listarTodos();
		//enviar al cliente la respuesta
		//PASO 1: crear un atributo
		request.setAttribute("Solicitudes", data);
		//PASO 2: direccionar a la pagina Solicitud.jsp
		request.getRequestDispatcher("/CapacitacionO.jsp").forward(request, response);
	}

}
