package com.example.springboot_demo.entity;

public class Tinstructorclass {
    private Integer id;

    private Short instructorid;//辅导员编号

    private Integer classid;//班级编号

    private Byte academicyearid;//学年

    private String term;//学期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getInstructorid() {
        return instructorid;
    }

    public void setInstructorid(Short instructorid) {
        this.instructorid = instructorid;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Byte getAcademicyearid() {
        return academicyearid;
    }

    public void setAcademicyearid(Byte academicyearid) {
        this.academicyearid = academicyearid;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "Tinstructorclass{" +
                "id=" + id +
                ", instructorid=" + instructorid +
                ", classid=" + classid +
                ", academicyearid=" + academicyearid +
                ", term='" + term + '\'' +
                '}';
    }
}