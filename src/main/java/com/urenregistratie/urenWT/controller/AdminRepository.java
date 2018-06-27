package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AdminRepository extends CrudRepository<Admin, Long> {

	
}
