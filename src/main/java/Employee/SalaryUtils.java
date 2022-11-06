package Employee;

import java.util.Arrays;

public class SalaryUtils {
    static double getSum(Employee[] employeeArray){

        return Arrays.stream(employeeArray).mapToDouble(Employee::getSalary).sum();
    }

}
