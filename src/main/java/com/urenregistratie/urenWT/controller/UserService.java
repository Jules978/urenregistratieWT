package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.EmployeeWT;
import com.urenregistratie.urenWT.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> giveAll (){
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return this.userRepository.existsById(id);
    }

    public User save(EmployeeWT employee){
        return userRepository.save(employee);
    }

    public void deleteById(Long id) {
        this.userRepository.deleteById(id);
        return;
    }
}