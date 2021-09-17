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

import net.universidad.entidad.Trabajador;
import net.universidad.services.TrabajadorService;

@WebServlet("/ServltTrabajadorJSN")
public class ServltTrabajadorJSN extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TrabajadorService sTrabajador;   
    
    public ServltTrabajadorJSN() {
        super();
        sTrabajador= new TrabajadorService();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Trabajador>listar= sTrabajador.listarTrabajador();
		Gson gson= new Gson();
		String json;
		
		json=gson.toJson(listar);
		
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter salida= response.getWriter();
		salida.println(json);
	}

}
