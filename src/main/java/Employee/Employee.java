package Employee;

public class Employee extends Person {
    private int salary;

    int baseSalary;

    public Employee(String name, char gender, int yearOfBirth, int salary) {
        super(name, gender, yearOfBirth);
        this.salary = salary;
    }

    boolean isSameName(Employee employee) {
        return this.getName().equals(employee.getName());
    }

    public int getSalary() {
        return salary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

}
