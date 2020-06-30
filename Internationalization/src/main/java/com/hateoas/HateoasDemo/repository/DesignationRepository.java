package com.hateoas.HateoasDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hateoas.HateoasDemo.models.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer>{
	
}
