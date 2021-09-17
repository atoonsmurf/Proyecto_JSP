package net.universidad.services;

import net.universidad.entidad.Bonificación;
import net.universidad.fabrica.DAOFactory;
import net.universidad.interfaces.BonificaciónDAO;

public class BonificaciónService {

		private DAOFactory fabrica=DAOFactory.getDAOFactory(1);
		private BonificaciónDAO bonificacionDAO=fabrica.getBonificaciónDAO();
		
		public int grabarBonificación(Bonificación bean) {
			return bonificacionDAO.grabarBonificación(bean);
			}
		
		public int actualizarBonificación(Bonificación bean,int cod) {
			return bonificacionDAO.actualizarBonificación(bean, cod);			
		}
		
		public int eliminarBonificación(int cod) {
			return bonificacionDAO.eliminarBonificación(cod);
			}
}
