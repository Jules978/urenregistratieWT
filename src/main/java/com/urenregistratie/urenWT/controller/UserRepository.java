package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

	
}
