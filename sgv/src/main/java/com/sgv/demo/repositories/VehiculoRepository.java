package com.sgv.demo.repositories;

import com.sgv.demo.model.Vehiculo;

public interface VehiculoRepository extends CRUDRepository<Vehiculo, String>{

	void changeState(String primaryKey);
}
