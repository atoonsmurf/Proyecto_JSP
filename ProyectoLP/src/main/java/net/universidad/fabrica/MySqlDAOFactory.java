package net.universidad.fabrica;

import net.universidad.dao.MySqlBonificaci�nDAO;
import net.universidad.dao.MySqlEstadoDAO;
import net.universidad.dao.MySqlSolicitudDAO;
import net.universidad.dao.MySqlTrabajadorDAO;
import net.universidad.dao.MySqlUsuarioDAO;
import net.universidad.interfaces.UsuarioDAO;
import net.universidad.interfaces.TrabajadorDAO;
import net.universidad.interfaces.EstadoDAO;
import net.universidad.interfaces.SolicitudDAO;
import net.universidad.interfaces.Bonificaci�nDAO;

public class MySqlDAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new MySqlUsuarioDAO();
	}
	
	@Override
	public EstadoDAO getEstadoDAO() {
		// TODO Auto-generated method stub
		return new MySqlEstadoDAO();
	}
	
	@Override
	public Bonificaci�nDAO getBonificaci�nDAO() {
		// TODO Auto-generated method stub
		return new MySqlBonificaci�nDAO();
	}
	
	@Override
	public SolicitudDAO getSolicitudDAO() {
		// TODO Auto-generated method stub
		return new MySqlSolicitudDAO();
	}

	@Override
	public TrabajadorDAO getTrabajadorDAO() {
		// TODO Auto-generated method stub
		return new MySqlTrabajadorDAO();
	}
	
	

}
