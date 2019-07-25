package pl.kierznowski.system.placowy.employee.types;

public class HourPayedEmployee extends Employee {

    private final double salaryPerHour;

    public HourPayedEmployee(int id, String name, String lastName, String adres, double hourPay) {
        super(id, name, lastName, adres);
        this.salaryPerHour = hourPay;
    }
}
