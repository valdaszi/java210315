package lt.bit.p0610;

import java.util.function.Function;

public class FunctionsDemo {

    public static void main(String[] args) {

        // 1 - normali klase
        class A implements Function<Integer, Integer> {
            @Override
            public Integer apply(Integer x) {
                return x * 2;
            }
        }
        Function<Integer, Integer> f1 = new A();
        System.out.println(f1.getClass().getName() + " = " + f1.apply(10));

        // 2 - anonimine klase
        Function<Integer, Integer> f2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * 3;
            }
        };
        System.out.println(f2.getClass().getName() + " = " + f2.apply(10));

        // 3 - lambda
        Function<Integer, Integer> f3 = x -> x * 4;
        System.out.println(f3.getClass().getName() + " = " + f3.apply(10));

    }

}
