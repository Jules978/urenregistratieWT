package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EmployeeClient")
public class EmployeeClient extends User {

    @Id
    @NotNull
    private Long ID;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String emailAdres;
    @NotNull
    private String telephoneNumber;
    @NotNull
    private int companyID;

    @Override
    public Long getID() {
        return ID;
    }

    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getemailAdres() {
        return emailAdres;
    }

    @Override
    public void setemailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCompanyID() { return companyID; }

    public void setCompanyID(int companyID) { this.companyID = companyID; }
}