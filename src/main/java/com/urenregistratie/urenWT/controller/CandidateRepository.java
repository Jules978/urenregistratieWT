package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Candidate;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

//	@Query("SELECT * FROM candidate")
//	//@Query("INSERT INTO `candidate` (`salary`, `userid`, `company_companyid`, `manager_external_userid`) VALUES ('1000.0', '0', '1', '1');")
//    public Candidate selectCandidate();
    
//	@Query(value = "SELECT salary FROM candidate where userid = :id", nativeQuery = true) 
//    List<Double> findSalaryById(@Param("id") Long id);
// 
    //Todo findById(Long id);
     
    //Optional<Todo> findById(Long id);
	@Query(value= "SELECT * FROM user, employeewt, candidate WHERE last_name = :lastname", nativeQuery = true)
	Candidate getPersonInfoByLastName(@Param("lastname")String lastname);
}
