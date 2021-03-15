package com.codeacademy.comparator_example;

import com.codeacademy.comparator_example.comparator.DepartmentComparator;
import com.codeacademy.comparator_example.model.Department;
import com.codeacademy.comparator_example.model.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorStarter {

    public static void start() {

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Elvis", 190.00, LocalDate.of(2021, 3, 1), Department.IT_DEPARTMENT));
        employee.add(new Employee(5, "Elvis", 500.00, LocalDate.of(2021, 3, 1), Department.MARKETING));
        employee.add(new Employee(2, "Tomas", 200.00, LocalDate.of(2021, 3, 4), Department.IT_DEPARTMENT));
        employee.add(new Employee(3, "Giedrius", 300.00, LocalDate.of(2021, 3, 3), Department.SALES));
        employee.add(new Employee(4, "Sarunas", 400.00, LocalDate.of(2021, 3, 2), Department.SALES));

//        System.out.println("Not sorted: " + employee);
//
//        employee.sort(new IdComparator());
//        System.out.println("Sorted by ID: " + employee);
//
//        employee.sort(new SalaryComparator());
//        System.out.println("Sorted by salary: " + employee);
//
//        employee.sort(Collections.reverseOrder(new SalaryComparator()));
//        System.out.println("Sorted by salary desc: " + employee);
//
//        employee.sort(new JoiningDateComparator());
//        System.out.println("Joining: " + employee);

//        employee.sort(new DepartmentComparator(Department.IT_DEPARTMENT));
//        System.out.println("Sorted by department:  " + employee);

        employee.sort(Collections.reverseOrder(new DepartmentComparator(Department.IT_DEPARTMENT)));
        System.out.println("Sorted (reversed) by department:  " + employee);
    }
}
