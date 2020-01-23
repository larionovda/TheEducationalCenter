package com.larionov.epam.service.impl;

import com.larionov.epam.entity.Student;
import com.larionov.epam.service.PrintStudent;

import java.util.List;

public class PrintStudentsImpl implements PrintStudent {
    @Override
    public void printStudents(List<Student> students) {
        students.stream().map(x -> x.getNameOfStudent() + " - До окончания обучения по программе " + x.getTrainingProgram().getNameOfTraining() +
                " осталось " + x.getLeftDays() + " день. Средний бал " + x.getAverageAssessment()).forEach(System.out::println);
    }
}
