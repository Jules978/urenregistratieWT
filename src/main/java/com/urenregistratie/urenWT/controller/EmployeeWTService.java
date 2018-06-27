package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.EmployeeWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeWTService {

    @Autowired
    EmployeeWTRepository employeeWTRepository;

    public Iterable<EmployeeWT> giveAll (){
        return employeeWTRepository.findAll();
    }
}