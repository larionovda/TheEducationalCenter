package com.larionov.epam.service;

import com.larionov.epam.entity.Student;

public interface Sorting {
    void sortFinalDate(Student...students);
    void sortAverageAssessments(Student...students);
}
