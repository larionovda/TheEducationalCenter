package com.larionov.epam.entity;

import java.time.LocalDate;
import java.util.List;

public class Student implements Comparable<Student> {
    /**
     * Имя студента.
     */
    private final String nameOfStudent;

    /**
     * Учебная программа, которая состоит из определенных курсов.
     */
    private final TrainingProgram trainingProgram;

    /**
     * В этой Map содержатся оценки за определенные курсы, оценки выставляются каждый день.
     */
    private List<Integer> assessments;

    /**
     * Дата, определяющая начало выполнения тренеровочной программы
     */
    private LocalDate startDate;

    /**
     * Средний бал студента
     */
    private double averageAssessment;

    /**
     * Переменная содержит количество дней до окончания учебной программы
     */
    private int leftDays;

    public Student(String nameOfStudent, TrainingProgram trainingProgram, List<Integer> assessments, LocalDate startDate) {
        this.nameOfStudent = nameOfStudent;
        this.trainingProgram = trainingProgram;
        this.assessments = assessments;
        this.startDate = startDate;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(this.averageAssessment, student.getAverageAssessment());
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public TrainingProgram getTrainingProgram() {
        return trainingProgram;
    }

    public List<Integer> getAssessments() {
        return assessments;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public double getAverageAssessment() {
        return averageAssessment;
    }

    public void setAverageAssessment(double averageAssessment) {
        this.averageAssessment = averageAssessment;
    }

    public int getLeftDays() {
        return leftDays;
    }

    public void setLeftDays(int leftDays) {
        this.leftDays = leftDays;
    }


}
