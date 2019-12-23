package com.larionov.epam.entity;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getLeftDays() > student2.getLeftDays()) {
            return 1;
        } else if (student1.getLeftDays() < student2.getLeftDays()) {
            return -1;
        } else {
            return 0;
        }
    }
}
