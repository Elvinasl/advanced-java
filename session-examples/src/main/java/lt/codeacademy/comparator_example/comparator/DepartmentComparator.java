package lt.codeacademy.comparator_example.comparator;

import lt.codeacademy.comparator_example.model.Department;
import lt.codeacademy.comparator_example.model.Employee;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee> {

    private Department primaryDepartment;

    public DepartmentComparator(Department primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getDepartment().equals(primaryDepartment) && !e2.getDepartment().equals(primaryDepartment)) return -1;
        if (e1.getDepartment().equals(primaryDepartment) && e2.getDepartment().equals(primaryDepartment)) return 0;
        return 1;
    }
}
