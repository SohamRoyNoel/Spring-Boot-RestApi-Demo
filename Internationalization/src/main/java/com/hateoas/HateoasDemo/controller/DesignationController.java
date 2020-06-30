package com.hateoas.HateoasDemo.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hateoas.HateoasDemo.models.Designation;
import com.hateoas.HateoasDemo.services.DesignationService;

@RestController
@RequestMapping("/international")
public class DesignationController {

	private DesignationService designationService;

	@Autowired
	public DesignationController(DesignationService designationService) {
		this.designationService = designationService;
	}
	
	@Autowired
	private MessageSource messageSource;
		
	@GetMapping("/langChange")
	public String getAllDesignation(@RequestHeader(name="lg", required=false) Locale locale){
		return messageSource.getMessage("good.morning.message", null, locale);
	}
	
	
	
}
