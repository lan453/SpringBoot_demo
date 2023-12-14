package com.example.springboot_demo.ventity;

import java.util.Date;

public class VFestivalRegTable {
    private long id;
    private String name;
    private String gender;
    private Date leaveDate;
    private Date backDate;
    private String destination;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Date getBackDate() {
        return backDate;
    }

    public void setBackDate(Date backDate) {
        this.backDate = backDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "festivalRegTable{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", leaveDate=" + leaveDate +
                ", backDate=" + backDate +
                ", destination='" + destination + '\'' +
                '}';
    }
}
