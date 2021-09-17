package net.universidad.utils;
import java.sql.Connection;
import java.sql.DriverManager;
public class MySqlConexion {
	public static Connection getConexion(){
		Connection cn=null;
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost/bd_universidadSLG?serverTimezone=UTC";
				cn=DriverManager.getConnection(url,"root","mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;	
	}
}
