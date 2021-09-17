package net.universidad.entidad;

import java.sql.Date;

public class SolicitudC {
	private int nroSoli,codTrab;
	private String descripcion,duracion;
	private String fecha;
	public int getNroSoli() {
		return nroSoli;
	}
	public void setNroSoli(int nroSoli) {
		this.nroSoli = nroSoli;
	}
	public int getCodTrab() {
		return codTrab;
	}
	public void setCodTrab(int codTrab) {
		this.codTrab = codTrab;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
