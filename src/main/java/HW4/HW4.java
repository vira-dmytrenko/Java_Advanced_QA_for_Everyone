package HW4;

public class HW4 {
    public static int HEIGHT = 10;

    public static void main(String[] args) {
        for (int i = 0; i <= HEIGHT; i++) {
            printSpaces(i);
            printNumbersBackward(i);
            printNumbersForward(i);
            System.out.println();
        }
    }
    static void printNumbersBackward(int nums) {
        for (int i = HEIGHT - 1 - nums; i >= 0; i--) {
            System.out.print(i);
        }
    }
    static void printNumbersForward(int nums) {
        for (int i = 1; i <= HEIGHT - 1 - nums; i++) {
            System.out.print(i);
        }
    }
    static void printSpaces(int spaces) {
        for (int i = 0; i <= spaces; i++) {
            System.out.print(" ");
        }
    }
}
