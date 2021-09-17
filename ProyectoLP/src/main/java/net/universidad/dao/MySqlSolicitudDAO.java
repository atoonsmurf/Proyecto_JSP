package net.universidad.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.universidad.entidad.SolicitudC;
import net.universidad.interfaces.SolicitudDAO;
import net.universidad.utils.MySqlConexion;

public class MySqlSolicitudDAO implements SolicitudDAO{

	@Override
	public int save(SolicitudC bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			//1
			cn=MySqlConexion.getConexion();
			//2
			String sql="insert into solxcapacitacion values(null,?,?,?,?)"; 
			//3
			pstm=cn.prepareStatement(sql);
			//4 
			pstm.setInt(1, bean.getCodTrab());
			pstm.setString(2, bean.getFecha());
			pstm.setString(3, bean.getDescripcion());
			pstm.setString(4,bean.getDuracion());
			//5
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
	public int update(SolicitudC bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			//1
			cn=MySqlConexion.getConexion();
			//2
			String sql="update solxcapacitacion set cod_trab=?,fecha_sol=?, tipo_cap=?,duracion_cap=? where nrosolcap=?"; 
			//3
			pstm=cn.prepareStatement(sql);
			//4 
			pstm.setInt(1, bean.getCodTrab());
			pstm.setString(2, bean.getFecha());	
			pstm.setString(3, bean.getDescripcion());
			pstm.setString(4, bean.getDuracion());
			pstm.setInt(5,bean.getNroSoli());
			//5
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
	public int delete(int nroSoli) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			//1
			cn=MySqlConexion.getConexion();
			//2
			String sql="delete from solxcapacitacion where nrosolcap=? "; 
			//3
			pstm=cn.prepareStatement(sql);
			//4 
			pstm.setInt(1, nroSoli);
			//5
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
	public List<SolicitudC> listAll() {
		//declarar y crear lista de Solicituds
		List<SolicitudC> lista=new ArrayList<SolicitudC>();
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			//1
			cn=MySqlConexion.getConexion();
			//2
			String sql="select *from solxcapacitacion"; 
			//3
			pstm=cn.prepareStatement(sql);
			//4 
			
			//5
			rs=pstm.executeQuery();
			//6 while
			while(rs.next()) {
				//7 crear objeto de la clase Solicitud
				SolicitudC bean=new SolicitudC();
				//8
				bean.setNroSoli(rs.getInt(1));
				bean.setCodTrab(rs.getInt(2));
				bean.setFecha(rs.getString(3));
				bean.setDescripcion(rs.getString(4));
				bean.setDuracion(rs.getString(5));
				//9
				lista.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}
	
	@Override
	public List<SolicitudC> listarPorAnio(String anio) {
		List<SolicitudC> lista=new ArrayList<SolicitudC>();
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			cn=MySqlConexion.getConexion();
			String sql="select*from solxcapacitacion where fecha_sol=?";
			pstm=cn.prepareStatement(sql);
			pstm.setString(1, anio);
			rs=pstm.executeQuery();
			while(rs.next()) {
				SolicitudC bean=new SolicitudC();
				bean.setNroSoli(rs.getInt(1));
				bean.setCodTrab(rs.getInt(2));
				bean.setFecha(rs.getString(3));
				bean.setDescripcion(rs.getString(4));
				bean.setDuracion(rs.getString(5));
				lista.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null) rs.close();
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

}
