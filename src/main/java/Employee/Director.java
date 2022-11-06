package Employee;

public class Director extends Manager {
    public Director(String name, char gender, int yearOfBirth, int salary) {
        super(name, gender, yearOfBirth, salary);
    }

    public int getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return baseSalary * getNumberOfSubordinates() / 100 * 9;
        }
        return baseSalary;
    }
}
