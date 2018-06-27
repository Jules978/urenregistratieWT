package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Approval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApprovalService {

    @Autowired
    ApprovalRepository approvalRepository;

    public Iterable<Approval> giveAll (){
        return approvalRepository.findAll();
    }
}