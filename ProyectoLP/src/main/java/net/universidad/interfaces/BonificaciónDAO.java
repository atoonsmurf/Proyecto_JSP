package net.universidad.interfaces;

import net.universidad.entidad.Bonificaci�n;

public interface Bonificaci�nDAO {
		
		public int grabarBonificaci�n(Bonificaci�n bean);
		public int actualizarBonificaci�n(Bonificaci�n bean,int cod);
		public int eliminarBonificaci�n(int cod);
}
