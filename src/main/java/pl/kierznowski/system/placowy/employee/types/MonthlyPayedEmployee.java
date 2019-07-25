package pl.kierznowski.system.placowy.employee.types;

public class MonthlyPayedEmployee extends Employee {

    private final double salary;

    public MonthlyPayedEmployee(int id, String name, String lastName, String adres, double salary) {
        super(id, name, lastName, adres);
        this.salary = salary;
    }
}
