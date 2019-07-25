package pl.kierznowski.system.placowy.employee.types;

public class MontlyPayedWithProvideEmployee  extends Employee{

    private final double salary;

    public MontlyPayedWithProvideEmployee(int id, String name, String lastName, String adres, double salary) {
        super(id, name, lastName, adres);
        this.salary = salary;
    }
}
