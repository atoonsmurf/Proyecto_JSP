package net.universidad.interfaces;

import java.util.List;

import net.universidad.entidad.Menu;
import net.universidad.entidad.Usuario;

public interface UsuarioDAO {

	//
	public Usuario iniciarSesion(String vLogin, String vClave);
	
	public List<Menu> traerMenus(int codUsuario);
}
