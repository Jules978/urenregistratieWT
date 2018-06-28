package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "WorkableDay")
public class WorkableDay{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workableDayID", updatable = false, nullable = false)
    private long workableDayID;
    @NotNull
    private boolean workableDay;
    @NotNull
    private int hoursWork;
    @NotNull
    private int hoursSick;
    @NotNull
    private int hoursAvailible;
    @NotNull
    private int hoursShortAbsence;

    public long getWorkableDayID() {
        return workableDayID;
    }

    public void setWorkableDayID(long workableDayID) {
        this.workableDayID = workableDayID;
    }

    public boolean isWorkableDay() {
        return workableDay;
    }

    public void setWorkableDay(boolean workableDay) {
        this.workableDay = workableDay;
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

    public int getHoursAvailible() {
        return hoursAvailible;
    }

    public void setHoursAvailible(int hoursAvailible) {
        this.hoursAvailible = hoursAvailible;
    }

    public int getHoursShortAbsence() {
        return hoursShortAbsence;
    }

    public void setHoursShortAbsence(int hoursShortAbsence) {
        this.hoursShortAbsence = hoursShortAbsence;
    }
}