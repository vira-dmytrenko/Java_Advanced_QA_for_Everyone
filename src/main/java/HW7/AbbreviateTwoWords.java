package HW7;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {

        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
}
