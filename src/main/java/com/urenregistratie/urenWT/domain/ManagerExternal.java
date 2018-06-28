package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ManagerExternal")
@Inheritance(strategy = InheritanceType.JOINED)
public class ManagerExternal extends User {

    @NotNull
    private int companyID;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }


}