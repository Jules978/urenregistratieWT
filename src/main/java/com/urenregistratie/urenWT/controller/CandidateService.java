package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    public Iterable<Candidate> giveAll (){
        return candidateRepository.findAll();
    }

    public Candidate findById(Long id) {
        return this.candidateRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return this.candidateRepository.existsById(id);
    }

    public Candidate save(Candidate candidate){
        return candidateRepository.save(candidate);
    }

    public void deleteById(Long id) {
        this.candidateRepository.deleteById(id);
        return;
    }
    
    public Candidate getPersonsInfoByLastName(String lastname)
    {
    	return candidateRepository.getPersonInfoByLastName(lastname);
    }
}