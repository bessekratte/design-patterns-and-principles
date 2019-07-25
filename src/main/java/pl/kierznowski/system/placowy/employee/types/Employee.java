package pl.kierznowski.system.placowy.employee.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Employee {

    private int id;
    private String name;
    private String lastName;
    private String adres;
    private boolean isWorkingOnHours;
    private double provision;
}
