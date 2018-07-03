package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Candidate;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

	//@Query("SELECT t.title FROM Todo t where t.id = :id")
	//@Query("INSERT INTO `candidate` (`salary`, `userid`, `company_companyid`, `manager_external_userid`) VALUES ('1000.0', '0', '1', '1');")
    //public String findTitleById(Long id);
     
    //@Query("SELECT t.title FROM Todo t where t.id = :id") 
    //Optional<String> findTitleById(@Param("id") Long id);
 
    //Todo findById(Long id);
     
    //Optional<Todo> findById(Long id);
}
