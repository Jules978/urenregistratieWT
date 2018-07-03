package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.HourRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HourRegistrationRepository extends CrudRepository<HourRegistration, Long> {
}
