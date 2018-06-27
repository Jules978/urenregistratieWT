package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.EmployeeClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeClientRepository extends CrudRepository<EmployeeClient, Long> {

	
}
