package com.urenregistratie.urenWT.domain;

import javax.persistence.*;

@Entity
@Table(name = "ManagerExternal")
@Inheritance(strategy = InheritanceType.JOINED)
public class ManagerExternal extends User {

//    @NotNull
    @ManyToOne
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}