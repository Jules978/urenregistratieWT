package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeClientService {

    @Autowired
    EmployeeClientRepository employeeClientRepository;

    public Iterable<EmployeeClient> giveAll (){
        return employeeClientRepository.findAll();
    }
}