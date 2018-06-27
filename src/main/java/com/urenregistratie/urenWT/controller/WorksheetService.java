package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Worksheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WorksheetService {

    @Autowired
    WorksheetRepository worksheetRepository;

    public Iterable<Worksheet> giveAll (){
        return worksheetRepository.findAll();
    }
}