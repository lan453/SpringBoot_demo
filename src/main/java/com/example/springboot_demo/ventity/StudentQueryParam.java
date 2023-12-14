package com.example.springboot_demo.ventity;

public class StudentQueryParam {
    private Integer colleageId;
    private Integer enteryear;
    private Integer classId;
    private String name;

    public Integer getColleageId() {
        return colleageId;
    }

    public void setColleageId(Integer colleageId) {
        this.colleageId = colleageId;
    }

    public Integer getEnteryear() {
        return enteryear;
    }

    public void setEnteryear(Integer enteryear) {
        this.enteryear = enteryear;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
