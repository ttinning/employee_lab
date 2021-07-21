package staff.management;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String departmentName, double budget) {
        super(name, niNumber, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public double payBonus() {
        return this.getSalary() * 0.02;
    }


}
