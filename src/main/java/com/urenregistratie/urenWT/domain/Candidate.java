package com.urenregistratie.urenWT.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Candidate")
public class Candidate extends EmployeeWT {

    //@NotNull
    private double salary;
    //@NotNull
    private enum approvalCandidate {FIRST_APPROVED, FINAL_APPROVED}
    //@NotNull
//    @ManyToOne
//    private Company company;
    //@NotNull
    @ManyToOne
    private ManagerExternal managerExternal;

    @OneToMany
    private List<HourRegistration> hourRegistrations = new ArrayList<>();

    public List<HourRegistration> getHourRegistrations() {
        return hourRegistrations;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public ManagerExternal getManagerExternal() {
        return managerExternal;
    }

    public void setManagerExternal(ManagerExternal managerExternal) {
        this.managerExternal = managerExternal;
    }
}