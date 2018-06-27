package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DayService {

    @Autowired
    DayRepository dayRepository;

    public Iterable<Day> giveAll (){
        return dayRepository.findAll();
    }
}