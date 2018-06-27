package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.EmployeeWT;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeWTRepository extends CrudRepository<EmployeeWT, Long> {

	
}
