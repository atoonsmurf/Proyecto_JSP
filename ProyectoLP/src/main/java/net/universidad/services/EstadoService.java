package net.universidad.services;

import java.util.List;

import net.universidad.entidad.Estado;
import net.universidad.fabrica.DAOFactory;
import net.universidad.interfaces.EstadoDAO;

public class EstadoService {
	private DAOFactory fabrica=DAOFactory.getDAOFactory(1);
	private EstadoDAO EstadoDAO=fabrica.getEstadoDAO();
	
	public List<Estado> listarTodos(){
		return EstadoDAO.listAll();
	}
	
}
