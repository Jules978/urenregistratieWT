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

    public Company findById(Long id) {
        return this.companyRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return this.companyRepository.existsById(id);
    }

    public Company save(Company company){
        return companyRepository.save(company);
    }

    public void deleteById(Long id) {
        this.companyRepository.deleteById(id);
        return;
    }
}