package com.example.springboot_demo.ventity;

public class Vinstructor {
    private Short id;

    private String num;

    private String name;

    private String enterdate;

    private String leavedate;

    private String colleageName;
    private Byte colleageid;

    public Byte getColleageid() {
        return colleageid;
    }

    public void setColleageid(Byte colleageid) {
        this.colleageid = colleageid;
    }

    public Vinstructor(Short id, String num, String name, String enterdate, String leavedate, String colleageName) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.enterdate = enterdate;
        this.leavedate = leavedate;
        this.colleageName = colleageName;
    }

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

    public String getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(String enterdate) {
        this.enterdate = enterdate;
    }

    public String getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(String leavedate) {
        this.leavedate = leavedate;
    }

    public String getColleageName() {
        return colleageName;
    }

    public void setColleageName(String colleageName) {
        this.colleageName = colleageName;
    }
}
