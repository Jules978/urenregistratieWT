package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Iterable<Admin> giveAll (){
        return adminRepository.findAll();
    }
}