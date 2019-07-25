package pl.kierznowski.system.placowy.employee;

import pl.kierznowski.system.placowy.employee.types.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {

    private final List<Employee> employees = new ArrayList<>();

    public boolean add(Employee employee) {
        employees.add(employee);
        return true;
    }

    public void removeById(int id) {
        employees.removeIf(x -> Integer.valueOf(x.getId()).equals(id));
    }

    public Optional<Employee> getById(int id) {
        return employees.stream()
                .filter(employee -> Integer.valueOf(employee.getId()).equals(id))
                .findAny();
    }
}
