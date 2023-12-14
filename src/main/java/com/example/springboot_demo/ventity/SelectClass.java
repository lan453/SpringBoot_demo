package com.example.springboot_demo.ventity;

public class SelectClass {
    private Integer classId;
    private String startTerm;
    private Integer aymin;
    private Integer aymax;
    private Integer count;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getStartTerm() {
        return startTerm;
    }

    public void setStartTerm(String startTerm) {
        this.startTerm = startTerm;
    }

    public Integer getAymin() {
        return aymin;
    }

    public void setAymin(Integer aymin) {
        this.aymin = aymin;
    }

    public Integer getAymax() {
        return aymax;
    }

    public void setAymax(Integer aymax) {
        this.aymax = aymax;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SelectClass{" +
                "classId=" + classId +
                ", startTerm='" + startTerm + '\'' +
                ", aymin=" + aymin +
                ", aymax=" + aymax +
                ", count=" + count +
                '}';
    }
}
