package com.larionov.epam.service.impl;

import com.larionov.epam.entity.Student;
import com.larionov.epam.repository.Students;
import com.larionov.epam.service.Calculation;
import com.larionov.epam.service.DemoService;

public class DemoServiceImpl implements DemoService {

    SortingImpl sorting = new SortingImpl();
    Students students = new Students();
    Calculation calculation = new CalculationImpl();

    public void service(){
        Student student1 = students.initStudent1();
        Student student2 = students.initStudent2();
        Student student3 = students.initStudent3();

        System.out.println("========Есть ли вероятность, что студенты успешно закончат учебную программу???\n");
        calculation.calcChance(student1);
        calculation.calcChance(student2);
        calculation.calcChance(student3);

        System.out.println("==============================================\n");
        System.out.println("СОРТИРОВКА ПО СРЕДНЕЙ ОЦЕНКЕ");
        sorting.sortAverageAssessments(student1, student2, student3);
        System.out.println("СОРТИРОВКА ПО КОЛИЧЕСТВУ ОСТАВШИХСЯ ДНЕЙ");
        sorting.sortFinalDate(student1,student2,student3);
    }
}
