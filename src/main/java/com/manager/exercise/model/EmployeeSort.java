package com.manager.exercise.model;

import lombok.Data;

import java.util.Comparator;

@Data
public class EmployeeSort implements Comparator<Employee> {

    private String employeeName;
    private Double salary;

    @Override
    public int compare(Employee e1, Employee e2) {
        return 0;
    }
}
