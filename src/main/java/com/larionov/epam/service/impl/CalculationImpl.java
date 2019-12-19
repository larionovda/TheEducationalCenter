package com.larionov.epam.service.impl;

import com.larionov.epam.entity.Course;
import com.larionov.epam.entity.Student;
import com.larionov.epam.service.Calculation;

import java.time.LocalDate;
import java.util.List;

import static java.lang.Math.ceil;

public class CalculationImpl implements Calculation {

    private static final double MIN_AVAILABLE_ASSESSMENT = 4.5;
    private static final int HOURS_OF_DAY = 8;
    private static final int MAX_ASSESSMENT = 5;

    @Override
    public void calcChance(Student student) {
        String alert;
        double sumOfAssessments = calcSumOfAssessments(student);
        double countOfAssessments = student.getAssessments().size();
        double countLeftDays = calcHowLeftDays(student);
        double chance = (sumOfAssessments + (MAX_ASSESSMENT * countLeftDays)) / (countOfAssessments + countLeftDays);
        alert = (MIN_AVAILABLE_ASSESSMENT > chance) ? "Нет вероятности, что закончит" : "Есть вероятность, что не будет отчислен";
        System.out.println(alert);
    }

    @Override
    public void calcIsSendDown(Student student) {
        String alert;
        alert = (MIN_AVAILABLE_ASSESSMENT > calcAverageAssessment(student)) ? "Отчислить" : "Может продолжать обучение";
        System.out.println(alert);
    }

    @Override
    public int calcHowLeftDays(Student student) {
        LocalDate finalDate = student.getStartDate().plusDays(calcAllDayOfProgram(student));
        return LocalDate.now().until(finalDate).getDays();
    }

    @Override
    public double calcAverageAssessment(Student student) {
        return (double) calcSumOfAssessments(student) / student.getAssessments().size();
    }

    @Override
    public int calcSumOfAssessments(Student student) {
        int sumAssessments = 0;
        List<Integer> assessments = student.getAssessments();
        for (Integer integer: assessments){
            sumAssessments += integer;
        }
        return sumAssessments;
    }

    @Override
    public int calcAllDayOfProgram(Student student) {
        double allHoursOfCourses = 0;
        List<Course> courses = student.getTrainingProgram().getCourses();
        for (Course course: courses){
            allHoursOfCourses += course.getDurationHrs();
        }
        return (int) ceil(allHoursOfCourses / HOURS_OF_DAY);
    }
}
