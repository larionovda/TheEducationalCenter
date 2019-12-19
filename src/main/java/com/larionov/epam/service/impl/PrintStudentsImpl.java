package com.larionov.epam.service.impl;

import com.larionov.epam.entity.Student;
import com.larionov.epam.service.PrintStudent;

import java.util.List;

public class PrintStudentsImpl implements PrintStudent {
    @Override
    public void printStudents(List<Student> students) {
        for (Student student: students){
            System.out.println(student.getNameOfStudent() + " - До окончания обучения по программе "
                    + student.getTrainingProgram().getNameOfTraining() + " осталось " + student.getLeftDays() +
                    " день. Средний бал " + student.getAverageAssessment());
        }
    }
}
