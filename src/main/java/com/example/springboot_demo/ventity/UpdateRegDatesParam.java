package com.example.springboot_demo.ventity;

import java.util.Date;

public class UpdateRegDatesParam {
    private Date regbegindate;
    private Date regenddate;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
