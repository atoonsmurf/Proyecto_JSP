package net.universidad.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import net.universidad.entidad.Menu;
import net.universidad.entidad.Usuario;
import net.universidad.interfaces.UsuarioDAO;
import net.universidad.utils.MySqlConexion;

public class MySqlUsuarioDAO implements UsuarioDAO {

	@Override
	public Usuario iniciarSesion(String vLogin, String vClave) {
Usuario bean= null;
		
		Connection con= null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			con= MySqlConexion.getConexion();
			
			String sql="Select cod_usu,nom_usu,ape_usu from tb_usuario where log_usu=? and pas_usu=?";
			
			pstm= con.prepareStatement(sql);
			
			pstm.setString(1, vLogin);
			pstm.setString(2, vClave);
			
			rs= pstm.executeQuery();
			
			
			if(rs.next()) {
				bean=new Usuario();
				bean.setCodigo(rs.getInt(1));
				bean.setNombres(rs.getString(2));
				bean.setApellidos(rs.getString(3));
				
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) con.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
				
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return bean;
	}

	@Override
	public List<Menu> traerMenus(int codUsuario) {
		
		List<Menu>listado=new ArrayList<Menu>();
		Connection cn =null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			
			cn=MySqlConexion.getConexion();
		
			String sql="select a.cod_men, m.des_men, m.url_men "
					+ "from tb_acceso a join tb_menu m "
					+ "on a.cod_men= m.cod_men where a.cod_usu=?";
			
			pstm=cn.prepareStatement(sql);
			
			pstm.setInt(1, codUsuario);
			
			rs=pstm.executeQuery();
			
			while (rs.next()) {
				Menu bean= new Menu();
				bean.setCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setUrl(rs.getString(3));
				
				listado.add(bean);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstm!=null)pstm.close();
				if(cn!=null) cn.close();
				
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return listado;
	}
}
