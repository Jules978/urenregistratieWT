package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MonthService {
	
	@Autowired
	MonthRepository monthRepository;
	
	public Iterable<Month> giveAll (){
		return monthRepository.findAll();
	}
}