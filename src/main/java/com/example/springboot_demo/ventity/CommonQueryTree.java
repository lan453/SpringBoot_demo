package com.example.springboot_demo.ventity;

public class CommonQueryTree {
    private Integer colleageId;
    private Integer enteryear;
    private Integer classId;
    private Long recordadviceId;

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

    public Long getRecordadviceId() {
        return recordadviceId;
    }

    public void setRecordadviceId(Long recordadviceId) {
        this.recordadviceId = recordadviceId;
    }

    @Override
    public String toString() {
        return "CommonQueryTree{" +
                "colleageId=" + colleageId +
                ", enteryear=" + enteryear +
                ", classId=" + classId +
                ", recordadviceId=" + recordadviceId +
                '}';
    }
}
