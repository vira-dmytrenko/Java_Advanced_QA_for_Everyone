package Employee;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Vera", 'f', 1985);

        Employee emp1 = new Employee("Vasil Shevchenko", 'm', 1980, 1000);
        Employee emp2 = new Employee("Dina Kostenko", 'f', 1985, 900);
        Employee emp3 = new Employee("Nik Jones", 'm', 1990, 800);
        Employee emp4 = new Employee("Vasil Shevchenko", 'm', 1989, 1100);
        Employee[] listOffEmployee = {emp1, emp2, emp3, emp4};


        // Класс должен иметь метод isSameName(Employee employee)
        //который возвращает true, если у сотрудника у которого был вызван метод и сотрудника
        //который был передан как параметр, одинаковое имя.
        System.out.println(emp1.isSameName(emp4));      // true



        System.out.println(EmployeeUtils.searchByName(listOffEmployee, "Mr. Vasil Shevchenko"));
        System.out.println(EmployeeUtils.searchByTextInName(listOffEmployee, "Shevchenko"));
//        System.out.println(EmployeeUtils.getBudget(listOffEmployee));


    }
}
