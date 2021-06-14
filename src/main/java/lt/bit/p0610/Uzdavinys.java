package lt.bit.p0610;

import java.util.Arrays;
import java.util.function.Function;

public class Uzdavinys {

    public static Function<Integer, int[]> multiplyAll(int[] array) {
        /* left blank for unlimited creativity :) */

        // Function<Integer, int[]> f = (Integer x) -> { return array; };
        Function<Integer, int[]> f = x -> {
//            for (int i = 0; i < array.length; i++) {
//                array[i] *= x;
//            }
//            return array;
            return Arrays.stream(array).map(a -> a * x).toArray();
        };
        return f;

//        return x -> Arrays.stream(array).map(a -> a * x).toArray();
    }

    public static void main(String[] args) {
        Function<Integer, int[]> f = multiplyAll(new int[] { 1, 2, 3 });

        int[] r1 = f.apply(2);
        System.out.println(Arrays.toString(r1));
        int[] r2 = f.apply(10);
        System.out.println(Arrays.toString(r2));
    }
}
