package com.sgv.demo.model;

public class Averia {

	private long id_averia;
	private String nom_evaluador;
	private String eva_preliminar;
	private String diagnostico;
	private String observaciones;
	private String id_solic_averia;
	private String fecha_averia;

	public Averia(long id_averia, String nom_evaluador, String eva_preliminar, String diagnostico, String observaciones,
			String id_solic_averia, String fecha_averia) {
		this.id_averia = id_averia;
		this.nom_evaluador = nom_evaluador;
		this.eva_preliminar = eva_preliminar;
		this.diagnostico = diagnostico;
		this.observaciones = observaciones;
		this.id_solic_averia = id_solic_averia;
		this.fecha_averia = fecha_averia;
	}

	public Averia() {
	}

	public long getId_averia() {
		return id_averia;
	}

	public void setId_averia(long id_averia) {
		this.id_averia = id_averia;
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

	public String getId_solic_averia() {
		return id_solic_averia;
	}

	public void setId_solic_averia(String id_solic_averia) {
		this.id_solic_averia = id_solic_averia;
	}

	public String getFecha_averia() {
		return fecha_averia;
	}

	public void setFecha_averia(String fecha_averia) {
		this.fecha_averia = fecha_averia;
	}

}
/*
 * CREATE TABLE tb_averia ( "id_averia" NUMBER GENERATED BY DEFAULT ON NULL AS
 * IDENTITY MINVALUE 10001 MAXVALUE 99999 INCREMENT BY 1 PRIMARY KEY,
 * "nom_evaluador" VARCHAR2(50) NOT NULL, "eva_preliminar" VARCHAR2(500) NOT
 * NULL, "diagnostico" VARCHAR2(500) NOT NULL, "observaciones" VARCHAR2(500) NOT
 * NULL, "id_solic_averia" varchar(8) NOT NULL REFERENCES tb_solicitud_averia,
 * "fecha_averia" String NOT NULL );
 * 
 */
