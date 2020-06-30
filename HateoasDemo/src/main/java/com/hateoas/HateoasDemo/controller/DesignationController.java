package com.hateoas.HateoasDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hateoas.HateoasDemo.models.Designation;
import com.hateoas.HateoasDemo.services.DesignationService;

@RestController
@RequestMapping("/desig")
public class DesignationController {

	private DesignationService designationService;

	@Autowired
	public DesignationController(DesignationService designationService) {
		this.designationService = designationService;
	}
	
	@GetMapping("/designation")
	public List<Designation> getAllDesignation(){
		return designationService.findAllDesignation();
	}
	
	@PostMapping("/designation")
	public Designation addEmployee(@RequestBody Designation thedesignation) {
		
		
		
		designationService.addDesignation(thedesignation);
		
		return thedesignation;
	}
	
	@PutMapping("/designation")
	public Designation updateEmployee(@RequestBody Designation thedesignation) {
				
		designationService.addDesignation(thedesignation);
		
		return thedesignation;
	}
	
}
