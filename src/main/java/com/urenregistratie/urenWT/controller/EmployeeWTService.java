package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Candidate;
import com.urenregistratie.urenWT.domain.EmployeeWT;
import com.urenregistratie.urenWT.domain.HourRegistration;

import java.util.Date;

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

    public EmployeeWT findById(Long id) {
        return this.employeeWTRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return this.employeeWTRepository.existsById(id);
    }

    public EmployeeWT save(EmployeeWT employee){
        return employeeWTRepository.save(employee);
    }

    public void deleteById(Long id) {
        this.employeeWTRepository.deleteById(id);
        return;
    }
    
}