package com.urenregistratie.urenWT.controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.urenregistratie.urenWT.domain.Candidate;
import com.urenregistratie.urenWT.domain.EmployeeWT;
import com.urenregistratie.urenWT.domain.HourRegistration;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeWTRepository extends CrudRepository<EmployeeWT, Long> {		

}
