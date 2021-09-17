package net.universidad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import net.universidad.entidad.Bonificación;
import net.universidad.interfaces.BonificaciónDAO;
import net.universidad.utils.MySqlConexion;

public class MySqlBonificaciónDAO implements BonificaciónDAO{

	
	@Override
	public int grabarBonificación(Bonificación bean) {
		// TODO Auto-generated method stub
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql="insert into solxbonificacion values(null,?,?,?,?)";
			pstm=cn.prepareStatement(sql);
			pstm.setInt(1, bean.getCodTrabajador());
			pstm.setString(2, bean.getFecha());
			pstm.setString(3, bean.getDetalle());
			pstm.setString(4, bean.getEstado());
			salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public int actualizarBonificación(Bonificación bean,int cod) {
		// TODO Auto-generated method stub
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql="update solxbonificacion set cod_trab=?,fec_solxb=?,detalle_solxb=?,estado_solxb=? where cod_solxb=?";
			pstm=cn.prepareStatement(sql);
			pstm.setInt(5, cod);
			pstm.setInt(1, bean.getCodTrabajador());
			pstm.setString(2, bean.getFecha());
			pstm.setString(3, bean.getDetalle());
			pstm.setString(4, bean.getEstado());
			salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}
	

	@Override
	public int eliminarBonificación(int cod) {
		// TODO Auto-generated method stub
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql="delete from solxbonificacion where cod_solxb=?";
			pstm=cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}
	
	
	
	
}
