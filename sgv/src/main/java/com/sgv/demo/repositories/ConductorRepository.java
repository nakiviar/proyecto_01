package com.sgv.demo.repositories;

import com.sgv.demo.model.Conductor;

public interface ConductorRepository extends CRUDRepository<Conductor, String> {
		
	void changeState(String primaryKey);
	
}
