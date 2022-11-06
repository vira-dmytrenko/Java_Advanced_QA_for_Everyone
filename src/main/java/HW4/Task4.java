package HW4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for(int i: array){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("find sum: " + Arrays.stream(array).sum());


        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("find max: " + Arrays.stream(array1).max().orElse(0));

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("find min: " + Arrays.stream(array2).min().orElse(0));

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("find average: " + Arrays.stream(array3).average().orElse(0.0));



        int[][] array4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum1 = 0;
        for (int [] arr: array4){
            for(int i: arr){
                sum1 += i;
            }
        }
        System.out.println(sum1);

        // version with streams
        System.out.println(Arrays.stream(array4).flatMapToInt(x -> Arrays.stream(x)).sum());

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(Arrays.stream(array5).flatMapToInt(x -> Arrays.stream(x)).max().orElse(0));

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.println(Arrays.stream(array6).flatMapToInt(x -> Arrays.stream(x)).count());

        System.out.println(3.0/0.0);
    }
}
