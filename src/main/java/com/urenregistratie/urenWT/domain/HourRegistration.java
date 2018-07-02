package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "HourRegistration")
public class HourRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hourRegistrationID", updatable = false, nullable = false)
    private long hourRegistrationID;
    @NotNull
    @ManyToOne
    private Candidate candidate;
    //@NotNull
    @Temporal(TemporalType.DATE)
    private Date startDate;
    //@NotNull
    @Temporal(TemporalType.DATE)
    private Date endDate;
    //@NotNull
    @OneToMany
    private List<WorkableDay> hoursList = new ArrayList<>();
    //private List<WorkableDay> hoursList = new List();
    @OneToOne
    private Approval approval;

    public long getHourRegistrationID() {
        return hourRegistrationID;
    }

    public void setHourRegistrationID(long hourRegistrationID) {
        this.hourRegistrationID = hourRegistrationID;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void addDay(WorkableDay workableDay) {
        this.hoursList.add(workableDay);
        if (workableDay.getHourRegistration() != this) {
        	workableDay.setHourRegistration(this);
        }
    }
    
    public List<WorkableDay> getHoursList() {
		return hoursList;
	}

	public void setHoursList(ArrayList<WorkableDay> hoursList) {
		this.hoursList = hoursList;
	}

	public Approval getApproval() {
		return approval;
	}

	public void setApproval(Approval approval) {
		this.approval = approval;
	}

	public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
