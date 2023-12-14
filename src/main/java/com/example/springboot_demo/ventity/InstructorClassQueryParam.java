package com.example.springboot_demo.ventity;

import java.util.List;

public class InstructorClassQueryParam {
    private String num;
    private String name;
    private List<Integer> enteryears;
    private List<Short> majorIds;
    private Byte colleageId;

    public Byte getColleageId() {
        return colleageId;
    }

    public void setColleageId(Byte colleageId) {
        this.colleageId = colleageId;
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

    public List<Integer> getEnteryears() {
        return enteryears;
    }

    public void setEnteryears(List<Integer> enteryears) {
        this.enteryears = enteryears;
    }

    public List<Short> getMajorIds() {
        return majorIds;
    }

    public void setMajorIds(List<Short> majorIds) {
        this.majorIds = majorIds;
    }
}
