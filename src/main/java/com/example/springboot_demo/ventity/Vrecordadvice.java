package com.example.springboot_demo.ventity;

import java.util.Date;

public class Vrecordadvice {
    private Long id;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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