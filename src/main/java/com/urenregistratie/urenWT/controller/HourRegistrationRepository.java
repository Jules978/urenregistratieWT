package com.urenregistratie.urenWT.controller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.urenregistratie.urenWT.domain.Candidate;
@Component
public interface HourRegistrationRepository {

	@Query(value= "SELECT * FROM user, employeewt, candidate WHERE last_name = :lastname", nativeQuery = true)
	Candidate getPersonInfoByLastName(@Param("lastname")String lastname);
	
}
