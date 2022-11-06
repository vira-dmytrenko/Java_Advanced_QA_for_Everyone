package Employee;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;
//import java.util.Calendar;
//import java.util.Date;

public class Person {
    private String name;
    private char gender;
    private int yearOfBirth;

    public Person(String name, char gender, int yearOfBirth) {
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        if (gender == 'm') {
            return "Mr. " + name;
        } else if (gender == 'f') {
            return "Ms. " + name;
        } else return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return Year.now().getValue() - yearOfBirth;

//        return LocalDate.now().getYear() - yearOfBirth;
//        return new Date().getYear();
//        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", gender=" + gender +
                ", age=" + getAge() +
                '}';
    }
}
