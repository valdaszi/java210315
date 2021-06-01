package lt.bit.p0531.p0601;

import java.util.Arrays;

public class AnoniminesKlasesDemo {

    class A {

    }

    public static void main(String[] args) {

        int[] numbers = { 2, 5, 6, 3, 8, -5};
        System.out.println("Pradines reiksmes: " + Arrays.toString(numbers));

        dvigubinti(numbers);

        System.out.println("Padvigubintas: " + Arrays.toString(numbers));

        dvigubinti(numbers);
        dvigubinti(numbers);

        System.out.println("Padvigubintas 2x: " + Arrays.toString(numbers));

        prideti(numbers, -10);
        prideti(numbers, 2);

        System.out.println("-10+2: " + Arrays.toString(numbers));

        dauginti(numbers, 3);
        System.out.println("*3: " + Arrays.toString(numbers));

        dalinti(numbers, 2);
        System.out.println("/2: " + Arrays.toString(numbers));

        sudetingasVeiksmas(numbers);
        System.out.println("???: " + Arrays.toString(numbers));

        sudetingasVeiksmas(numbers, new SudetingasVeiksmas());
        System.out.println("*10: " + Arrays.toString(numbers));

        sudetingasVeiksmas(numbers, new SudetingasVeiksmasKitas());
        System.out.println("+10: " + Arrays.toString(numbers));

        class KazkoksVeiksmas implements Function {
            @Override
            public int apply(int x) {
                return x * x / 100000;
            }
        }

        sudetingasVeiksmas(numbers, new KazkoksVeiksmas());
        System.out.println("x * x / 100000: " + Arrays.toString(numbers));

        class KazkoksVeiksmasKitas implements Function {
            @Override
            public int apply(int x) {
                return (x + x) / 3;
            }
        }

        sudetingasVeiksmas(numbers, new KazkoksVeiksmasKitas());
        System.out.println("(x + x) / 3: " + Arrays.toString(numbers));

//        class ????? implements Function {
//            @Override
//            public int apply(int x) {
//                return x / 2;
//            }
//        }
        sudetingasVeiksmas(numbers, new Function() {
            @Override
            public int apply(int x) {
                return x / 2;
            }
        });
        System.out.println("x / 2: " + Arrays.toString(numbers));


        Function f = new SudetingasVeiksmas();
        System.out.println(f.getClass().getName());


        class X extends SudetingasVeiksmas {
        }
        f = new SudetingasVeiksmas() { };
        System.out.println("new SudetingasVeiksmas() { }: " + f.getClass().getName());

        class Y implements Function {
            @Override
            public int apply(int x) {
                return 0;
            }
        }
        f = new Function() {
            @Override
            public int apply(int x) {
                return 0;
            }
        };
        System.out.println("new Function() { ... }: " + f.getClass().getName());

    }

    private static void sudetingasVeiksmas(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            // numbers[i] = (numbers[i] * 3 - 10) - numbers[i];
            numbers[i] = sudetingoVeiksmoFunkcija(numbers[i]);
        }
    }

    private static int sudetingoVeiksmoFunkcija(int number) {
        return (number * 3 - 10) - number;
    }


    private static void dalinti(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] /= x;
        }
    }

    private static void dauginti(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= x;
        }
    }

    private static void prideti(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += x;
        }
    }

    private static void dvigubinti(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
    }

    private static void sudetingasVeiksmas(int[] numbers, Function op) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = op.apply(numbers[i]);
        }
    }

    interface Function {

        int apply(int x);

    }
}



class SudetingasVeiksmas implements AnoniminesKlasesDemo.Function {

    @Override
    public int apply(int x) {
        return x * 10;
    }
}

class SudetingasVeiksmasKitas implements AnoniminesKlasesDemo.Function {

    @Override
    public int apply(int x) {
        return x + 10;
    }
}

