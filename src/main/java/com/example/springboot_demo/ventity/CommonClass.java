package com.example.springboot_demo.ventity;

public class CommonClass {
    private byte id;
    private String className;
    private Integer enteryear;
    private String colleageName;
    private String majorName;

    public CommonClass(byte id, String className, Integer enteryear, String colleageName, String majorName) {
        this.id = id;
        this.className = className;
        this.enteryear = enteryear;
        this.colleageName = colleageName;
        this.majorName = majorName;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
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
}
