package com.codeacademy.comparator_example.comparator;

import com.codeacademy.comparator_example.model.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}
