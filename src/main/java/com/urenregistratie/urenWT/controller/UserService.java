package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public Iterable<User> geefAllen (){
		return userRepository.findAll();
	}
}