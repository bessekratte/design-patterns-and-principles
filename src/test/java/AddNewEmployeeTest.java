import org.junit.Test;
import pl.kierznowski.system.placowy.employee.types.Employee;
import pl.kierznowski.system.placowy.employee.EmployeeRepository;
import pl.kierznowski.system.placowy.employee.SalaryType;

import static org.junit.Assert.*;

public class AddNewEmployeeTest {
//    AddEmp <EmpID> "<nazwisko>" "<adres>" H <stawka-godzinowa>
//    AddEmp <EmpID> "<nazwisko>" "<adres>" S <wynagrodzenie-miesięczne>
//    AddEmp <EmpID> "<nazwisko>" "<adres>" C <wynagrodzenie-miesięczne> <stawka-prowizji>

    @Test
    public void addEmployeeMonthlyPayed() {

        EmployeeRepository service = new EmployeeRepository();
        int id = 1;
        String lastName = "Kowalski";
        String name = "Jan";
        String adres = "Warszawska 8";
        SalaryType salaryType = SalaryType.PER_HOUR;
        Employee employee = new Employee(id, name, lastName, adres, salaryType, );
        service.add(employee);
        Employee employeeFromService = service.getById(id);
        assertEquals(employee, employeeFromService);
    }
}