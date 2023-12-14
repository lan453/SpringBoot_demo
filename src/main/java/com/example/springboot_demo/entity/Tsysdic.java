package com.example.springboot_demo.entity;

public class Tsysdic {
    private Long id;

    private String tablename;

    private String filedname;

    private Byte value;

    private String des;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getFiledname() {
        return filedname;
    }

    public void setFiledname(String filedname) {
        this.filedname = filedname;
    }

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}