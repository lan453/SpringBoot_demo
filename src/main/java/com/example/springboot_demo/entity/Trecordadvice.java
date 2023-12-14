package com.example.springboot_demo.entity;

import java.util.Date;

public class Trecordadvice {
    private Long id;

    private Byte festival;

    private Date begindate;

    private Date enddate;

    private Date regbegindate;

    private Date regenddate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getFestival() {
        return festival;
    }

    public void setFestival(Byte festival) {
        this.festival = festival;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getRegbegindate() {
        return regbegindate;
    }

    public void setRegbegindate(Date regbegindate) {
        this.regbegindate = regbegindate;
    }

    public Date getRegenddate() {
        return regenddate;
    }

    public void setRegenddate(Date regenddate) {
        this.regenddate = regenddate;
    }
}