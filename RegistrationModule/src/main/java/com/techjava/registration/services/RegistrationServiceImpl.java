package com.techjava.registration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techjava.registration.repository.RegistrationRepository;
import com.techjava.registration.model.Registration;
@Service
public class RegistrationServiceImpl implements RegistrationService{
@Autowired
private RegistrationRepository repo;
	@Override
	public Registration createdata(Registration data) {
		
		return repo.save(data);
	}

}
