package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Candidate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

	@Query(value= "SELECT * FROM user, employeewt, candidate WHERE last_name = :lastname", nativeQuery = true)
	Candidate getPersonInfoByLastName(@Param("lastname")String lastname);
}
