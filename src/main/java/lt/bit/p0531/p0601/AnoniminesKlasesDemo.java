package lt.bit.p0531.p0601;

import java.util.Arrays;

public class AnoniminesKlasesDemo {

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


    }

    private static void sudetingasVeiksmas(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            // numbers[i] = (numbers[i] * 3 - 10) - numbers[i];
            numbers[i] = function(numbers[i]);
        }
    }

    private static int function(int number) {
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
}

interface Function {

}

