package net.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import net.universidad.entidad.Trabajador;
import net.universidad.interfaces.TrabajadorDAO;
import net.universidad.utils.MySqlConexion;

public class MySqlTrabajadorDAO implements TrabajadorDAO {

	@Override
	public List<Trabajador> listado() {
		
		List<Trabajador>lista=new ArrayList<Trabajador>();
		Connection cn =null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		
		try {
			
			cn=MySqlConexion.getConexion();
		
			String sql="Select*from trabajador";
			
			pstm=cn.prepareStatement(sql);
			
			rs=pstm.executeQuery();
			
			while (rs.next()) {
				Trabajador bean= new Trabajador();
				bean.setCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				
				
				lista.add(bean);
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
		
		
		
		
		return lista;
	

	}

}
