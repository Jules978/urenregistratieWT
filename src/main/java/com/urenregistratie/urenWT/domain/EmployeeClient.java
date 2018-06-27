package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EmployeeClient")
public class EmployeeClient extends User {
    @NotNull
    private int companyID;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }
}