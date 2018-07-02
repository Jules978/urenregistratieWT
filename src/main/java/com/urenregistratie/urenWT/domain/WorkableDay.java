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
    //@NotNull
    private boolean workableDay;
    @NotNull
    private int standardHours;
    //@NotNull
    private int overtime125;
    //@NotNull
    private int overtime150;
    //@NotNull
    private int overtime200;
    //@NotNull
    private int sickHours;
    //@NotNull
    private int vacationHours;
    //@NotNull
    private int nationalHolidayHours;
    //@NotNull
    private int shortAbsenceHours;
    //@NotNull
    private int specialLeaveOfAbsenceHours;
    //@NotNull
    private int trainingHours;
    //@NotNull
    private int availableHours;
    //@NotNull
    private int extraKilometers;
    //@NotNull
    private String commentCandidate;  
    @ManyToOne
    private HourRegistration hourRegistration;

    public long getWorkableDayID() {
        return workableDayID;
    }

    public HourRegistration getHourRegistration() {
		return hourRegistration;
	}

	public void setHourRegistration(HourRegistration hourRegistration) {
		this.hourRegistration = hourRegistration;
	}

	public void setWorkableDayID(long workableDayID) {
        this.workableDayID = workableDayID;
    }

    public int getStandardHours() {
		return standardHours;
	}

	public void setStandardHours(int standardHours) {
		this.standardHours = standardHours;
	}

	public int getOvertime125() {
		return overtime125;
	}

	public void setOvertime125(int overtime125) {
		this.overtime125 = overtime125;
	}

	public int getOvertime150() {
		return overtime150;
	}

	public void setOvertime150(int overtime150) {
		this.overtime150 = overtime150;
	}

	public int getOvertime200() {
		return overtime200;
	}

	public void setOvertime200(int overtime200) {
		this.overtime200 = overtime200;
	}

	public int getSickHours() {
		return sickHours;
	}

	public void setSickHours(int sickHours) {
		this.sickHours = sickHours;
	}

	public int getVacationHours() {
		return vacationHours;
	}

	public void setVacationHours(int vacationHours) {
		this.vacationHours = vacationHours;
	}

	public int getNationalHolidayHours() {
		return nationalHolidayHours;
	}

	public void setNationalHolidayHours(int nationalHolidayHours) {
		this.nationalHolidayHours = nationalHolidayHours;
	}

	public int getShortAbsenceHours() {
		return shortAbsenceHours;
	}

	public void setShortAbsenceHours(int shortAbsenceHours) {
		this.shortAbsenceHours = shortAbsenceHours;
	}

	public int getSpecialLeaveOfAbsenceHours() {
		return specialLeaveOfAbsenceHours;
	}

	public void setSpecialLeaveOfAbsenceHours(int specialLeaveOfAbsenceHours) {
		this.specialLeaveOfAbsenceHours = specialLeaveOfAbsenceHours;
	}

	public int getTrainingHours() {
		return trainingHours;
	}

	public void setTrainingHours(int trainingHours) {
		this.trainingHours = trainingHours;
	}

	public int getAvailableHours() {
		return availableHours;
	}

	public void setAvailableHours(int availableHours) {
		this.availableHours = availableHours;
	}

	public int getExtraKilometers() {
		return extraKilometers;
	}

	public void setExtraKilometers(int extraKilometers) {
		this.extraKilometers = extraKilometers;
	}

	public String getCommentCandidate() {
		return commentCandidate;
	}

	public void setCommentCandidate(String commentCandidate) {
		this.commentCandidate = commentCandidate;
	}

	public boolean isWorkableDay() {
        return workableDay;
    }

    public void setWorkableDay(boolean workableDay) {
        this.workableDay = workableDay;
    }


}