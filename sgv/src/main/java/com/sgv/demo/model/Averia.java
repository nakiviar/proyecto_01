package com.sgv.demo.model;

public class Averia {

}
/*
     CREATE TABLE tb_averia (
      "id_averia" NUMBER  GENERATED BY DEFAULT ON NULL AS IDENTITY MINVALUE 10001 MAXVALUE 99999 INCREMENT BY 1 PRIMARY KEY,
      "nom_evaluador" VARCHAR2(50) NOT NULL,
      "eva_preliminar" VARCHAR2(500) NOT NULL,
      "diagnostico" VARCHAR2(500) NOT NULL,
      "observaciones" VARCHAR2(500) NOT NULL,
      "id_solic_averia" varchar(8) NOT NULL REFERENCES tb_solicitud_averia,
      "fecha_averia" DATE NOT NULL
    );
   
 * */
 