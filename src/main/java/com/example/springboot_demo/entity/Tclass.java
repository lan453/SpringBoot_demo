package com.example.springboot_demo.entity;

public class Tclass {
    private Integer id;

    private String name;

    private Integer enteryear;

    private Short majorid;

    private Byte colleageid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnteryear() {
        return enteryear;
    }

    public void setEnteryear(Integer enteryear) {
        this.enteryear = enteryear;
    }

    public Short getMajorid() {
        return majorid;
    }

    public void setMajorid(Short majorid) {
        this.majorid = majorid;
    }

    public Byte getColleageid() {
        return colleageid;
    }

    public void setColleageid(Byte colleageid) {
        this.colleageid = colleageid;
    }
}