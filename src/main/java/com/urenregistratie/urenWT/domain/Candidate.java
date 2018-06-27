package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Candidate")
public class Candidate extends User {

    private double salary;
    @NotNull
    private int companyID;
    @NotNull
    private int employingClientID;

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

    public int getEmployingClientID() {
        return employingClientID;
    }

    public void setEmployingClientID(int employingClientID) {
        this.employingClientID = employingClientID;
    }
}