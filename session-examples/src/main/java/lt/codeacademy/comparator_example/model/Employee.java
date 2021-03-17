package lt.codeacademy.comparator_example.model;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;
    private Department department;

    public Employee(int id, String name, double salary, LocalDate joiningDate, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                ", department=" + department +
                '}';
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getId() - e2.getId();
    }
}
