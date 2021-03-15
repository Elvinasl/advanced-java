package com.codeacademy.comparator_example.comparator;

import com.codeacademy.comparator_example.model.Employee;

import java.util.Comparator;

public class JoiningDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getJoiningDate().equals(e2.getJoiningDate())) return 0;
        if(e1.getJoiningDate().isBefore(e2.getJoiningDate())) return -1;
        return 1;
    }
}
