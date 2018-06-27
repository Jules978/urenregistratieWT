package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public Iterable<Company> giveAll (){
        return companyRepository.findAll();
    }
}