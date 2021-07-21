package staff;

public class Employee {

    private String name; String niNumber; double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber= niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0){
            this.salary += amount;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }

}
