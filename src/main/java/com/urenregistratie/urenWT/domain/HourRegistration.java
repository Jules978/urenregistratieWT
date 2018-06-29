package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;

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
    private ArrayList<Integer> hoursList = new ArrayList();
    //@NotNull
    private String commentAdminWT;
    //@NotNull
    private String commentManagerExternal;

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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Integer> getHoursList() {
        return hoursList;
    }

    public void setHoursList(ArrayList<Integer> hoursList) {
        this.hoursList = hoursList;
    }

    public String getCommentAdminWT() {
        return commentAdminWT;
    }

    public void setCommentAdminWT(String commentAdminWT) {
        this.commentAdminWT = commentAdminWT;
    }

    public String getCommentManagerExternal() {
        return commentManagerExternal;
    }

    public void setCommentManagerExternal(String commentManagerExternal) {
        this.commentManagerExternal = commentManagerExternal;
    }
}
