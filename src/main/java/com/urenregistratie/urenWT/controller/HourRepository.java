package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Hour;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HourRepository extends CrudRepository<Hour, Long> {

	
}
