package lab4;

import lab4.Employee;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Employee> employees;

    public Manager() {
        employees = new ArrayList();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}