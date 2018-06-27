package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Year;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface YearRepository extends CrudRepository<Year, Long> {

	
}
