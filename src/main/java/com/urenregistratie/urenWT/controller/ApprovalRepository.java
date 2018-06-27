package com.urenregistratie.urenWT.controller;

import com.urenregistratie.urenWT.domain.Approval;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ApprovalRepository extends CrudRepository<Approval, Long> {

	
}
