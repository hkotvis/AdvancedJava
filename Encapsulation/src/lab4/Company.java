package lab4;

import lab4.Manager;

public class Company {
    private Manager m;

    public Company() {
        m = new Manager();
    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        m.hireEmployee(firstName, lastName, ssn);
    }

    public Manager getManager() {
        return m;
    }

    public void setManager(Manager m) {
        this.m = m;
    }
}
