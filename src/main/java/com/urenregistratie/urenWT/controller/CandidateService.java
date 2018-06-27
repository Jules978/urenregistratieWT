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
}