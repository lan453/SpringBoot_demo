package com.example.springboot_demo.ventity;

import java.util.ArrayList;
import java.util.List;

public class VColleage {
    private int id;
    private String text;
    private List<VColleage> children = new ArrayList<>();

    public VColleage() {
    }

    public VColleage(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<VColleage> getChildren() {
        return children;
    }

    public void setChildren(List<VColleage> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "VColleage{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", children=" + children +
                '}';
    }
}
