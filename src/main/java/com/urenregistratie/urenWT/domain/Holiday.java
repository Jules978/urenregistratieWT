package com.urenregistratie.urenWT.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Holiday")
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "holidayID", updatable = false, nullable = false)
    private long holidayID;
    //@NotNull
    @Temporal(TemporalType.DATE)
    private Date startDate;
    //@NotNull
    @Temporal(TemporalType.DATE)
    private Date endDate;
    //@NotNull
    private int vacationHours;

    public long getHolidayID() {
        return holidayID;
    }

    public void setHolidayID(long holidayID) {
        this.holidayID = holidayID;
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

    public int getVacationHours() {
        return vacationHours;
    }

    public void setVacationHours(int vacationHours) {
        this.vacationHours = vacationHours;
    }
}