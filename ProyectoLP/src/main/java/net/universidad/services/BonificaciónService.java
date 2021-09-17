package net.universidad.services;

import net.universidad.entidad.Bonificaci�n;
import net.universidad.fabrica.DAOFactory;
import net.universidad.interfaces.Bonificaci�nDAO;

public class Bonificaci�nService {

		private DAOFactory fabrica=DAOFactory.getDAOFactory(1);
		private Bonificaci�nDAO bonificacionDAO=fabrica.getBonificaci�nDAO();
		
		public int grabarBonificaci�n(Bonificaci�n bean) {
			return bonificacionDAO.grabarBonificaci�n(bean);
			}
		
		public int actualizarBonificaci�n(Bonificaci�n bean,int cod) {
			return bonificacionDAO.actualizarBonificaci�n(bean, cod);			
		}
		
		public int eliminarBonificaci�n(int cod) {
			return bonificacionDAO.eliminarBonificaci�n(cod);
			}
}
