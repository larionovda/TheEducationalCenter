package com.larionov.epam.entity;

import java.util.List;

public class TrainingProgram {
    private final String nameOfTraining;
    private List<Course> courses;

    public TrainingProgram(String nameOfTraining, List<Course> courses) {
        this.nameOfTraining = nameOfTraining;
        this.courses = courses;
    }

    public String getNameOfTraining() {
        return nameOfTraining;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
