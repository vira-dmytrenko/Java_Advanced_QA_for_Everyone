package HW5;

import java.util.Arrays;
import java.util.Collections;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Collections
                .frequency(Arrays.asList(arrayOfSheeps), true);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(counter.countSheeps(array1));
    }


}
