package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Year;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class YearService {
	
	@Autowired
	YearRepository yearRepository;
	
	public Iterable<Year> giveAll (){
		return yearRepository.findAll();
	}
}