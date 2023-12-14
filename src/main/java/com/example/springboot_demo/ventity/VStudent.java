package com.example.springboot_demo.ventity;

public class VStudent {
    private Long id;
    private String num;
    private String name;
    private String gender;
    private String className;
    private String tel;
    private Integer enteryear;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getEnteryear() {
        return enteryear;
    }

    public void setEnteryear(Integer enteryear) {
        this.enteryear = enteryear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "VStudent{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", tel='" + tel + '\'' +
                ", enteryear=" + enteryear +
                ", address='" + address + '\'' +
                '}';
    }
}
