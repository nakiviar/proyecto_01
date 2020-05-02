package com.sgv.demo.model;

public class Mantenimiento {

	private long id_mant;
	private String nom_evaluador;
	private String eva_preliminar;
	private String diagnostico;
	private String observaciones;
	private String fecha_mant;
	private String prox_fecha;

	public Mantenimiento(long id_mant, String nom_evaluador, String eva_preliminar, String diagnostico,
			String observaciones, String fecha_mant, String prox_fecha) {
		this.id_mant = id_mant;
		this.nom_evaluador = nom_evaluador;
		this.eva_preliminar = eva_preliminar;
		this.diagnostico = diagnostico;
		this.observaciones = observaciones;
		this.fecha_mant = fecha_mant;
		this.prox_fecha = prox_fecha;
	}

	public Mantenimiento() {
	}

	public long getId_mant() {
		return id_mant;
	}

	public void setId_mant(long id_mant) {
		this.id_mant = id_mant;
	}

	public String getNom_evaluador() {
		return nom_evaluador;
	}

	public void setNom_evaluador(String nom_evaluador) {
		this.nom_evaluador = nom_evaluador;
	}

	public String getEva_preliminar() {
		return eva_preliminar;
	}

	public void setEva_preliminar(String eva_preliminar) {
		this.eva_preliminar = eva_preliminar;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getFecha_mant() {
		return fecha_mant;
	}

	public void setFecha_mant(String fecha_mant) {
		this.fecha_mant = fecha_mant;
	}

	public String getProx_fecha() {
		return prox_fecha;
	}

	public void setProx_fecha(String prox_fecha) {
		this.prox_fecha = prox_fecha;
	}

}
/**
 * CREATE TABLE tb_mantenimiento( "id_mant" NUMBER GENERATED BY DEFAULT AS
 * IDENTITY MINVALUE 10001 MAXVALUE 99999 INCREMENT BY 1 PRIMARY KEY,
 * "nom_evaluador" VARCHAR(50) NOT NULL, "eva_preliminar" VARCHAR(500) NOT NULL,
 * "diagnostico" VARCHAR(500) NOT NULL, "observaciones" VARCHAR(500) NOT NULL,
 * "fecha_mant" String, "prox_fecha" String );
 */
