package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyID", updatable = false, nullable = false)
    private long companyID;
    @NotNull
    private String companyName;
    @NotNull
    private String addressLine1;
    @NotNull
    private String addressLine2;
    @NotNull
    private String zipCode;
    @NotNull
    private String city;
    @NotNull
    private String emailAddress;
    @NotNull
    private String telephoneNumber;
    @NotNull
    private double salary;

    public long getCompanyID() {
        return companyID;
    }

    public void setCompanyID(long companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAdresLine1() {
        return addressLine1;
    }

    public void setAdresLine1(String adresLine1) {
        this.addressLine1 = adresLine1;
    }

    public String getAdresLine2() {
        return addressLine2;
    }

    public void setAdresLine2(String adresLine2) {
        this.addressLine2 = adresLine2;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailAdress() {
        return emailAddress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAddress = emailAdress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
