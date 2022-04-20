package com.manager.exercise.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Comparator;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Department implements Comparator<Department> {
    private Integer deptId;
    private String deptName;
    private String deptLocation;


    @Override
    public int compare(Department d1, Department d2) {
        return d1.getDeptName().compareTo(d2.getDeptName());
    }
}
