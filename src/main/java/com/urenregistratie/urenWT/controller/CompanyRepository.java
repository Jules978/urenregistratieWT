package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CompanyRepository extends CrudRepository<Company, Long> {

	
}
