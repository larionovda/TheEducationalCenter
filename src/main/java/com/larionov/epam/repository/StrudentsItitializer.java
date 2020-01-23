package com.larionov.epam.repository;

import com.larionov.epam.entity.Course;
import com.larionov.epam.entity.Student;
import com.larionov.epam.entity.TrainingProgram;
import com.larionov.epam.service.impl.CalculationImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StrudentsItitializer {

    CalculationImpl calculation = new CalculationImpl();
    List<Course> courses = new ArrayList<Course>();

    public Student initStudent1() {

        courses.add(new Course("Технология Java Servlets", 16));
        courses.add(new Course("Struts Framework", 24));
        courses.add(new Course("Spring Framework", 48));
        courses.add(new Course("Hibernate", 20));

        List<Integer> assessments = new ArrayList<>();
        assessments.add(3);
        assessments.add(4);
        assessments.add(2);
        assessments.add(5);
        assessments.add(3);
        assessments.add(3);


        LocalDate startDate = LocalDate.of(2019, 12, 16);
        TrainingProgram trainingProgram = new TrainingProgram("J2EE Developer", courses);

        Student student = new Student("Ivan Ivanov", trainingProgram, assessments, startDate);
        student.setAverageAssessment(calculation.calcAverageAssessment(student));
        student.setLeftDays(calculation.calcHowLeftDays(student));
        return student;
    }

    public Student initStudent2() {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Обзор технологий Java", 8));
        courses.add(new Course("Библиотека JFC/Swing", 16));
        courses.add(new Course("Технология JDBC", 16));
        courses.add(new Course("Технология JAX", 52));
        courses.add(new Course("Библиотеки commons", 44));

        List<Integer> assessments = new ArrayList<>();
        assessments.add(4);
        assessments.add(5);
        assessments.add(3);
        assessments.add(2);
        assessments.add(3);
        assessments.add(3);
        assessments.add(5);
        assessments.add(5);

        LocalDate startDate = LocalDate.of(2019, 12, 16);
        TrainingProgram trainingProgram = new TrainingProgram("Java Developer ", courses);

        Student student = new Student("Petr Petrov", trainingProgram, assessments, startDate);
        student.setAverageAssessment(calculation.calcAverageAssessment(student));
        student.setLeftDays(calculation.calcHowLeftDays(student));
        return student;
    }

    public Student initStudent3() {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course("Обзор", 5));
        courses.add(new Course("Библиотека", 3));
        courses.add(new Course("Технология", 6));
        courses.add(new Course("JAX", 10));
        courses.add(new Course("commons", 4));

        List<Integer> assessments = new ArrayList<>();
        assessments.add(4);
        assessments.add(5);
        assessments.add(5);
        assessments.add(4);
        assessments.add(4);
        assessments.add(4);
        assessments.add(5);
        assessments.add(5);

        LocalDate startDate = LocalDate.of(2019, 12, 16);
        TrainingProgram trainingProgram = new TrainingProgram("Developer ", courses);

        Student student = new Student("Roma Romanov", trainingProgram, assessments, startDate);
        student.setAverageAssessment(calculation.calcAverageAssessment(student));
        student.setLeftDays(calculation.calcHowLeftDays(student));
        return student;
    }
}
