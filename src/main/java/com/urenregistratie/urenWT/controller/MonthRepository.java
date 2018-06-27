package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Month;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MonthRepository extends CrudRepository<Month, Long> {

	
}
