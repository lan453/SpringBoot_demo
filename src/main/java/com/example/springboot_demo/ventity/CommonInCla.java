package com.example.springboot_demo.ventity;

public class CommonInCla {
    private Byte id;
    private String className;
    private Integer enteryear;
    private String majorName;
    private String des;
    private String term;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
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

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "CommonInCla{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", enteryear=" + enteryear +
                ", majorName='" + majorName + '\'' +
                ", des='" + des + '\'' +
                ", term='" + term + '\'' +
                '}';
    }
}
