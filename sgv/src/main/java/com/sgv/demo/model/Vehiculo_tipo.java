package com.sgv.demo.model;

public class Vehiculo_tipo {

	private int id_tipo_vehiculo;
	private String nombre_tipo;

	public int getId_tipo_vehiculo() {
		return id_tipo_vehiculo;
	}

	public void setId_tipo_vehiculo(int id_tipo_vehiculo) {
		this.id_tipo_vehiculo = id_tipo_vehiculo;
	}

	public String getNombre_tipo() {
		return nombre_tipo;
	}

	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}

	public Vehiculo_tipo(int id_tipo_vehiculo, String nombre_tipo) {
		this.id_tipo_vehiculo = id_tipo_vehiculo;
		this.nombre_tipo = nombre_tipo;
	}

	public Vehiculo_tipo() {

	}

}

/*
 * CREATE TABLE tb_tipo_vehiculo ( "id_tipo_vehiculo" NUMBER GENERATED BY
 * DEFAULT ON NULL AS IDENTITY START WITH 1 INCREMENT BY 1 PRIMARY KEY,
 * "nombre_tipo" VARCHAR2(50) NOT NULL );
 */
