package net.universidad.services;

import java.util.List;

import net.universidad.entidad.Menu;
import net.universidad.entidad.Usuario;
import net.universidad.fabrica.DAOFactory;
import net.universidad.interfaces.UsuarioDAO;

public class UsuarioService {

	private DAOFactory fabrica= DAOFactory.getDAOFactory(1);
	
	private UsuarioDAO usuarioDAO= fabrica.getUsuarioDAO();
	
	//
	
	public Usuario login_iniciar(String vlogin, String vclave) {
		return usuarioDAO.iniciarSesion(vlogin, vclave);
		
	}
	
	public List<Menu> traer_menus(int codUsuario){
		return usuarioDAO.traerMenus(codUsuario);
	}
	
	
}
