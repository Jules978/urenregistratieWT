package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EmployeeWT")
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeWT extends User {

    @NotNull
    private String addressLine1;
    private String addressLine2;
    @NotNull
    private String zipCode;
    @NotNull
    private String city;

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

}