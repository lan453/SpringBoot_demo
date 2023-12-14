package com.example.springboot_demo.ventity;

public class VUnionSelectClass {
    private Integer id;
    private String className;
    private Integer enteryear;
    private String colleageName;
    private String majorName;
    private Short instructorId;
    private String instructorName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getEnteryear() {
        return enteryear;
    }

    public void setEnteryear(Integer enteryear) {
        this.enteryear = enteryear;
    }

    public String getColleageName() {
        return colleageName;
    }

    public void setColleageName(String colleageName) {
        this.colleageName = colleageName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Short getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Short instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public String toString() {
        return "VUnionSelectClass{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", enteryear=" + enteryear +
                ", colleageName='" + colleageName + '\'' +
                ", majorName='" + majorName + '\'' +
                ", instructorId=" + instructorId +
                ", instructorName='" + instructorName + '\'' +
                '}';
    }
}
