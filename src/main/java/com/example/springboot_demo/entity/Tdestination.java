package com.example.springboot_demo.entity;

import java.util.Date;

public class Tdestination {
    private Long id;

    private Long recordadviceid;

    private Long studentid;

    private Long provinceid;

    private Long cityid;

    private Long countyid;

    private String detail;

    private Date backdate;

    private Date leavedate;

    private Integer isleave;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecordadviceid() {
        return recordadviceid;
    }

    public void setRecordadviceid(Long recordadviceid) {
        this.recordadviceid = recordadviceid;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public Long getCountyid() {
        return countyid;
    }

    public void setCountyid(Long countyid) {
        this.countyid = countyid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getBackdate() {
        return backdate;
    }

    public void setBackdate(Date backdate) {
        this.backdate = backdate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public Integer getIsleave() {
        return isleave;
    }

    public void setIsleave(Integer isleave) {
        this.isleave = isleave;
    }
}