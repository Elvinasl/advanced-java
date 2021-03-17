package lt.codeacademy.comparator_example.comparator;

import lt.codeacademy.comparator_example.model.Employee;

import java.util.Collections;
import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getId() - e2.getId();
    }

    @Override
    public Comparator<Employee> reversed() {
        return Collections.reverseOrder(this);
    }
}
