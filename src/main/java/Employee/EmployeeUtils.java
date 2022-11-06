package Employee;


import java.util.Arrays;
import java.util.Optional;

public class EmployeeUtils {

    static Optional<Employee> searchByName(Employee[] emp, String name) {

        return Arrays.stream(emp).filter(x -> x.getName().equals(name)).findAny();
    }

    static Optional<Employee> searchByTextInName(Employee[] emp, String text) {

        return Arrays.stream(emp).filter(x -> x.getName().contains(text)).findAny();
    }

    static double getBudget(Employee[] emp) {

        return SalaryUtils.getSum(emp);
    }


    static double findMinSalary(Employee[] emp) {

        return Arrays.stream(emp).mapToDouble(Employee::getSalary).min().orElse(0);
    }

    static double findMaxSalary(Employee[] emp) {

        return Arrays.stream(emp).mapToDouble(Employee::getSalary).max().orElse(0);
    }

}
