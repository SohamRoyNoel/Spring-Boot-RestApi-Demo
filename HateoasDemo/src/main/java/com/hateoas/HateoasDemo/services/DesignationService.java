package com.hateoas.HateoasDemo.services;

import java.util.List;

import com.hateoas.HateoasDemo.models.Designation;

public interface DesignationService {

	List<Designation> findAllDesignation();

	Designation findDesignation(int id);

	Designation addDesignation(Designation degs);

	//void deleteuser(int id);
	
}
