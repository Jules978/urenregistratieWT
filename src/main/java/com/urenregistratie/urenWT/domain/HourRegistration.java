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
    private int candidateID;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @NotNull
    private ArrayList<Integer> hoursArraylist = new ArrayList();
    @NotNull
    private String commentAdminWT;
    @NotNull
    private String commentManagerExternal;

    public long getHourRegistrationID() {
        return hourRegistrationID;
    }

    public void setHourRegistrationID(long hourRegistrationID) {
        this.hourRegistrationID = hourRegistrationID;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
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

    public ArrayList<Integer> getHoursArraylist() {
        return hoursArraylist;
    }

    public void setHoursArraylist(ArrayList<Integer> hoursArraylist) {
        this.hoursArraylist = hoursArraylist;
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
