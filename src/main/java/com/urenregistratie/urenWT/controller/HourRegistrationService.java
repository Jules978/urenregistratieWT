package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.HourRegistration;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HourRegistrationService {

    @Autowired
    HourRegistrationRepository hourRegistrationRepository;

    public Iterable<HourRegistration> giveAll (){
        return hourRegistrationRepository.findAll();
    }

    public HourRegistration findById(Long id) {
        return this.hourRegistrationRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return this.hourRegistrationRepository.existsById(id);
    }

    public HourRegistration save(HourRegistration hourRegistration){
        return hourRegistrationRepository.save(hourRegistration);
    }

    public void deleteById(Long id) {
        this.hourRegistrationRepository.deleteById(id);
        return;
    }
    
    public ArrayList<HourRegistration> getAllCandidateHourRegs(Long id)
    {
    	return this.hourRegistrationRepository.getAllCandidateHourRegs(id);
    }

}
