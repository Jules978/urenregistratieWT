package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Approval")
public class Approval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long ID;
    @NotNull
    private boolean approvalEmployingClient;
    @NotNull
    private boolean approvalWT;
    @NotNull
    private String comment;
    @NotNull
    private int candidateID;
    @NotNull
    private int employingClientID;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public boolean isApprovalEmployingClient() {
        return approvalEmployingClient;
    }

    public void setApprovalEmployingClient(boolean approvalEmployingClient) {
        this.approvalEmployingClient = approvalEmployingClient;
    }

    public boolean isApprovalWT() {
        return approvalWT;
    }

    public void setApprovalWT(boolean approvalWT) {
        this.approvalWT = approvalWT;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public int getEmployingClientID() {
        return employingClientID;
    }

    public void setEmployingClientID(int employingClientID) {
        this.employingClientID = employingClientID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
