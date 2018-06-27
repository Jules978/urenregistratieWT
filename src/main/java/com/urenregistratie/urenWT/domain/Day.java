package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Day")
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long ID;

    @NotNull
    @Min(1)
    @Max(31)
    private int day;
    @NotNull
    private boolean specialDay;
    @NotNull
    private boolean weekendDay;
    @NotNull
    private int hoursWorked;
    @NotNull
    private int hoursSick;
    @NotNull
    private int hoursAvailible;
    @NotNull
    private int hoursShortAbsence;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isSpecialDay() {
        return specialDay;
    }

    public void setSpecialDay(boolean specialDay) {
        this.specialDay = specialDay;
    }

    public boolean isWeekendDay() {
        return weekendDay;
    }

    public void setWeekendDay(boolean weekendDay) {
        this.weekendDay = weekendDay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
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