package com.larionov.epam.service.impl;

import com.larionov.epam.entity.Student;
import com.larionov.epam.entity.StudentComparator;
import com.larionov.epam.service.PrintStudent;
import com.larionov.epam.service.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingImpl implements Sorting {

    private PrintStudent printStudent = new PrintStudentsImpl();

    @Override
    public void sortFinalDate(Student... students) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        studentList.sort(new StudentComparator());
        printStudent.printStudents(studentList);
    }

    @Override
    public void sortAverageAssessments(Student... students) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        Collections.sort(studentList);
        printStudent.printStudents(studentList);
    }
}
