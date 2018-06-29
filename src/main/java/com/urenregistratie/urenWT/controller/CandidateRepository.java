package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Candidate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

	
}
