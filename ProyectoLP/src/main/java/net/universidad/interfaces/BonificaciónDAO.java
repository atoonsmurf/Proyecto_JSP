package net.universidad.interfaces;

import net.universidad.entidad.Bonificación;

public interface BonificaciónDAO {
		
		public int grabarBonificación(Bonificación bean);
		public int actualizarBonificación(Bonificación bean,int cod);
		public int eliminarBonificación(int cod);
}
