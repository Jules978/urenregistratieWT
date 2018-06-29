package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.ManagerExternal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ManagerExternalService {

    @Autowired
    ManagerExternalRepository managerExternalRepository;

    public Iterable<ManagerExternal> giveAll (){
        return managerExternalRepository.findAll();
    }

    public ManagerExternal findById(Long id) {
        return this.managerExternalRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return this.managerExternalRepository.existsById(id);
    }

    public ManagerExternal save(ManagerExternal managerExternal){
        return managerExternalRepository.save(managerExternal);
    }

    public void deleteById(Long id) {
        this.managerExternalRepository.deleteById(id);
        return;
    }
}
