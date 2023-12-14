package com.example.springboot_demo.entity;

import java.util.Date;

public class Tinstructor {
    private Short id;

    private String num;

    private String name;

    private Date enterdate;

    private Date leavedate;

    private Byte colleageid;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public Byte getColleageid() {
        return colleageid;
    }

    public void setColleageid(Byte colleageid) {
        this.colleageid = colleageid;
    }
}