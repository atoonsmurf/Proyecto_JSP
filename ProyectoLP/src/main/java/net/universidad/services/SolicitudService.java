package net.universidad.services;

import java.util.List;

import net.universidad.entidad.SolicitudC;
import net.universidad.fabrica.DAOFactory;
import net.universidad.interfaces.SolicitudDAO;

public class SolicitudService {
	//Paso 1: indicar origen de datos "MYSQL" a la fabrica "DAOFactory"
	private DAOFactory fabrica=DAOFactory.getDAOFactory(1);
	//Paso 2: indicar el dao que se va a trabajar de la sub fabrica "usar objeto fabrica"
	private SolicitudDAO SolicitudDAO=fabrica.getSolicitudDAO();
	
	
	public int agregar(SolicitudC bean) {
		return SolicitudDAO.save(bean);
	}
	public int actualizar(SolicitudC bean) {
		return SolicitudDAO.update(bean);
	}
	public int eliminar(int nroSoli) {
		return SolicitudDAO.delete(nroSoli);
	}
	public List<SolicitudC> listarTodos(){
		return SolicitudDAO.listAll();
	}
	
	public List<SolicitudC> listarPorAnioSolicitud(String anio){
		return SolicitudDAO.listarPorAnio(anio);
	}
	
	
}
