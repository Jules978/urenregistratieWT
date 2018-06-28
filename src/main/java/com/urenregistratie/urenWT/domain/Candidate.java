package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Candidate")
public class Candidate extends EmployeeWT {

    @NotNull
    private double salary;
    @NotNull
    private enum approvalCandidate {FIRST_APPROVED, FINAL_APPROVED}
    @NotNull
    private int companyID;
    @NotNull
    private int managerExternalID;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getManagerExternalID() {
        return managerExternalID;
    }

    public void setManagerExternalID(int managerExternalID) {
        this.managerExternalID = managerExternalID;
    }
}