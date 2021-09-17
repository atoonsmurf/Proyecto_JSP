package net.universidad.fabrica;

import net.universidad.interfaces.UsuarioDAO;
import net.universidad.interfaces.TrabajadorDAO;
import net.universidad.interfaces.EstadoDAO;
import net.universidad.interfaces.SolicitudDAO;
import net.universidad.interfaces.BonificaciónDAO;

public abstract class DAOFactory {
	// los posibles orígenes de datos
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;
    // Existirá un método get por cada DAO que exista en el sistema
    // Ejemplo:
    //public abstract ArticuloDAO getArticuloDAO();
    // registramos nuestros daos
    
    public abstract UsuarioDAO getUsuarioDAO();
    public abstract TrabajadorDAO getTrabajadorDAO();
    public abstract EstadoDAO getEstadoDAO();
    public abstract SolicitudDAO getSolicitudDAO();
    public abstract BonificaciónDAO getBonificaciónDAO();
 
    public static DAOFactory getDAOFactory(int whichFactory){
        switch(whichFactory){	
       	case MYSQL:
        	   return new MySqlDAOFactory();
        	case XML:
        	    //return new XmlDAOFactory();
        	case ORACLE:
        	    return new OracleDAOFactory();
        	/*case DB2:
        	    return new Db2DAOFactory();*/
        	case SQLSERVER:
        	    return null;
        	/*case XML:
        	    return new XmlDAOFactory();*/
        	default:
        	    return null;
        }
     }
}
