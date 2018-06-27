package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DayRepository extends CrudRepository<Day, Long> {

	
}