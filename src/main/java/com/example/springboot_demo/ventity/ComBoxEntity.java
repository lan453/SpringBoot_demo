package com.example.springboot_demo.ventity;

import java.util.ArrayList;
import java.util.List;

public class ComBoxEntity {
    private int id;
    private String text;
    List<ComBoxEntity> children = new ArrayList<>();

    public ComBoxEntity(int id, String text) {
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

    public List<ComBoxEntity> getChildren() {
        return children;
    }

    public void setChildren(List<ComBoxEntity> children) {
        this.children = children;
    }
}
