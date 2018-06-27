package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Hour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HourService {
	
	@Autowired
	HourRepository hourRepository;
	
	public Iterable<Hour> giveAll (){
		return hourRepository.findAll();
	}
}