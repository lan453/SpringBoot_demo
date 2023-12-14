package com.example.springboot_demo.ventity;

public class QueryClassParam {
    private Byte academicYearId;
    private Byte term;
    private Boolean isAtSchool;
    private Short instructorId;

    public Byte getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Byte academicYearId) {
        this.academicYearId = academicYearId;
    }

    public Byte getTerm() {
        return term;
    }

    public void setTerm(Byte term) {
        this.term = term;
    }

    public Boolean getAtSchool() {
        return isAtSchool;
    }

    public void setAtSchool(Boolean atSchool) {
        isAtSchool = atSchool;
    }

    public Short getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Short instructorId) {
        this.instructorId = instructorId;
    }
}
