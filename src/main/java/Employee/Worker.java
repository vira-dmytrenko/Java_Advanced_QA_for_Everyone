package Employee;

public class Worker extends Employee{

    public Worker(String name, char gender, int yearOfBirth, int salary) {
        super(name, gender, yearOfBirth, salary);
    }

    public int getSalary(){
        return getBaseSalary();
    }


}
