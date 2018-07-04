package com.urenregistratie.urenWT.domain;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name = "Candidate")
public class Candidate extends EmployeeWT {

    //@NotNull
    private double salary;
    //@NotNull
    private enum approvalCandidate {FIRST_APPROVED, FINAL_APPROVED}
    //@NotNull
    @ManyToOne
    private Company company;
    //@NotNull
    @ManyToOne
    private ManagerExternal managerExternal;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "candidate", cascade = CascadeType.ALL)
    private List<HourRegistration> hourLists = new ArrayList();
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ManagerExternal getManagerExternal() {
        return managerExternal;
    }

    public void setManagerExternal(ManagerExternal managerExternal) {
        this.managerExternal = managerExternal;
    }
    
    public List<HourRegistration> getHourLists() {
		return hourLists;
	}

	public void setHourLists(List<HourRegistration> hourLists) {
		this.hourLists = hourLists;
	}

	public void addDay(HourRegistration hourregistration) {
        this.hourLists.add(hourregistration);
        if (hourregistration.getCandidate() != this) {
        	hourregistration.setCandidate(this);
        }
    }
}