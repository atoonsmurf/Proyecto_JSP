package net.universidad.services;

import java.util.List;

import net.universidad.entidad.Trabajador;
import net.universidad.fabrica.DAOFactory;
import net.universidad.interfaces.TrabajadorDAO;



public class TrabajadorService {
private DAOFactory fabrica= DAOFactory.getDAOFactory(1);
	
	private TrabajadorDAO trabajadoresDAO=fabrica.getTrabajadorDAO();
	
	public List<Trabajador>listarTrabajador() {
		return trabajadoresDAO.listado();
	}
}
