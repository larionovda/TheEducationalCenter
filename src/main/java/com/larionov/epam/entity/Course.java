package com.larionov.epam.entity;

public class Course {
    private String nameOfCourse;
    private Integer durationHrs;

    public Course(String nameOfCourse, Integer hrs) {
        this.nameOfCourse = nameOfCourse;
        this.durationHrs = hrs;
    }

    public Integer getDurationHrs() {
        return durationHrs;
    }
}
