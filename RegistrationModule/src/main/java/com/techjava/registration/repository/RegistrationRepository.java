package com.techjava.registration.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techjava.registration.model.Registration;


@Repository
public interface RegistrationRepository extends JpaRepository<Registration,String> {
    
	
}