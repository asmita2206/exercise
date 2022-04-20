package com.manager.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Employee implements Comparable<Employee>, Comparator<Employee> {

    private Integer employeeId;
    private String employeeName;
    private Double salary;
    private String email;

    public Employee(int employeeId, String employeeName, double salary, String email) {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
        this.email=email;
    }


    @Override
    public int compareTo(Employee e) {
        return this.getEmployeeName().compareTo(e.getEmployeeName());
    }

    @Override
    public int compare(Employee e1,Employee e2) {
        if(e1.getSalary()>e2.getSalary()){
           return 1;}
        else if(e1.getSalary()<e2.getSalary()){
           return -1;
        }
        return 0;
    }

    Function<Employee, String> firstName = Employee::getEmployeeName;
    Function<Employee, Double> bySalary= Employee::getSalary;
    
    Comparator<Employee> compareByFirstNameSAlary =Comparator.comparing(firstName).thenComparing(bySalary);


   /* @Override
    public boolean equals(Object o) {

        return true;
    }

    @Override
    public int hashCode() {
        return 15;
    }*/
}
