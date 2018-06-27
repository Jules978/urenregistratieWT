package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Worksheet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface WorksheetRepository extends CrudRepository<Worksheet, Long> {

	
}
