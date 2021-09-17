package net.universidad.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


import net.universidad.entidad.SolicitudC;

import net.universidad.services.SolicitudService;


@WebServlet("/ServletSolicitudPorAnio")
public class ServletSolicitudPorAnio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletSolicitudPorAnio() {
        super();
       
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String anios;
		anios=request.getParameter("Anio");
		List<SolicitudC> lista=new SolicitudService().listarPorAnioSolicitud(anios);
		Gson gson=new Gson();
		String json=gson.toJson(lista);
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter salida=response.getWriter();
		salida.println(json);
		
	}

}
