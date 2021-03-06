package com.sgv.demo.model;

public class Averia_Historial {

	private long detalle;
	private String id_historial;
	private long id_averia;

	public Averia_Historial(long detalle, String id_historial, long id_averia) {
		this.detalle = detalle;
		this.id_historial = id_historial;
		this.id_averia = id_averia;
	}

	public Averia_Historial() {
	}

	public long getDetalle() {
		return detalle;
	}

	public void setDetalle(long detalle) {
		this.detalle = detalle;
	}

	public String getId_historial() {
		return id_historial;
	}

	public void setId_historial(String id_historial) {
		this.id_historial = id_historial;
	}

	public long getId_averia() {
		return id_averia;
	}

	public void setId_averia(long id_averia) {
		this.id_averia = id_averia;
	}

}
/**
 * 
 * CREATE TABLE tb_averia_historial ( "detalle" NUMBER GENERATED BY DEFAULT ON
 * NULL AS IDENTITY START WITH 1 INCREMENT BY 1 , "id_historial" VARCHAR2(7) NOT
 * NULL REFERENCES TB_historial_vehiculo, "id_averia" NUMBER NOT NULL REFERENCES
 * tb_averia, PRIMARY KEY("detalle","id_historial") );
 */
