package com.hateoas.HateoasDemo.services.impls;

import com.hateoas.HateoasDemo.models.Designation;
import com.hateoas.HateoasDemo.repository.DesignationRepository;
import com.hateoas.HateoasDemo.services.DesignationService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesignationServiceImpl implements DesignationService {

	private DesignationRepository designationRepository;

	@Autowired
	public DesignationServiceImpl(DesignationRepository designationRepository) {
		this.designationRepository = designationRepository;
	}

	@Override
	public List<Designation> findAllDesignation() {
		return designationRepository.findAll();
	}

	@Override
	public Designation findDesignation(int id) {
		return designationRepository.getOne(id);
	}

	@Override
	public Designation addDesignation(Designation degs) {
		return designationRepository.save(degs);
	}

}
