package Employee;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, char gender, int yearOfBirth, int salary) {
        super(name, gender, yearOfBirth, salary);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getSalary() {
        if (numberOfSubordinates > 0) {
            return baseSalary * numberOfSubordinates / 100 * 3;
        }
        return baseSalary;
    }


}
