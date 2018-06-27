package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Hour")
public class Hour{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long ID;

    @NotNull
    private int candidateID;
    @NotNull
    private int hoursWork;
    @NotNull
    private int hoursSick;
    @NotNull
    private int hoursAvailable;
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public int getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(int hoursWork) {
        this.hoursWork = hoursWork;
    }

    public int getHoursSick() {
        return hoursSick;
    }

    public void setHoursSick(int hoursSick) {
        this.hoursSick = hoursSick;
    }

    public int getHoursAvailable() {
        return hoursAvailable;
    }

    public void setHoursAvailable(int hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}