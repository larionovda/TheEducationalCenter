package com.larionov.epam.service;

import com.larionov.epam.entity.Student;

public interface Calculation {
    void calcIsSendDown(Student student);
    int calcHowLeftDays(Student student);
    double calcAverageAssessment(Student student);
    int calcAllDayOfProgram(Student student);
    void calcChance(Student student);
    int calcSumOfAssessments(Student student);
}
