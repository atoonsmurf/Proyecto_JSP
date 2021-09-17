package net.universidad.interfaces;

import java.util.List;

import net.universidad.entidad.SolicitudC;

public interface SolicitudDAO {
	public int save(SolicitudC bean);
	public int update(SolicitudC bean);
	public int delete(int nroSoli);
	public List<SolicitudC> listAll();
	public List<SolicitudC>listarPorAnio(String anio);
}
