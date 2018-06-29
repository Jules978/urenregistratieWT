package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.ManagerExternal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ManagerExternalRepository extends CrudRepository<ManagerExternal, Long> {
}
