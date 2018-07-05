package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.HourRegistration;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface HourRegistrationRepository extends CrudRepository<HourRegistration, Long> {
	@Query(value= "SELECT `hour_registrationid`, `end_date`, `start_date` FROM `hour_registration` AS urenlijst INNER JOIN `candidate_hour_lists` AS urenlijstid ON urenlijst.hour_registrationid = urenlijstid.hour_lists_hour_registrationid INNER JOIN `candidate` AS kandidaat ON urenlijstid.candidate_userid = kandidaat.userid WHERE kandidaat.`userid`= 1", nativeQuery = true)
	ArrayList<HourRegistration> getAllCandidateHourRegs(@Param("candidateID")Long id);
}
