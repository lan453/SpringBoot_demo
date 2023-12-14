package com.example.springboot_demo.ventity;

import com.example.springboot_demo.entity.Tinstructor;
import com.example.springboot_demo.entity.Tinstructorclass;

import java.util.List;

public class InstructorClassParam {
    private Tinstructor instructor;
    private List<Tinstructorclass> instructorclasses;

    public Tinstructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Tinstructor instructor) {
        this.instructor = instructor;
    }

    public List<Tinstructorclass> getInstructorclasses() {
        return instructorclasses;
    }

    public void setInstructorclasses(List<Tinstructorclass> instructorclasses) {
        this.instructorclasses = instructorclasses;
    }
}
