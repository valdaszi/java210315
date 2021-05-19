import java.math.BigInteger;

public class UzdavinysSachmatai {

    public static void main(String[] args) {
        for (int i = 1; i <= 64; i++) {
            System.out.println(i + ": " + langelis(i) +
                    ", suma: " + suma(i) +
                    ", suma2: " + suma2(i));
        }
    }

    public static int langelis(long x) {
        int number = 1;
        for (int i = 2; i <= x; i++) {
            number *= 2;
        }
        return number;
    }

    public static double suma(long x) {
        double number = 0;
        for (int i = 0; i < x; i++) {
            number += Math.pow(2, i);
        }
        return number;
    }

    public static BigInteger suma2(long x) {
        BigInteger number = BigInteger.ONE;
        BigInteger langelis = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            langelis = langelis.multiply(BigInteger.TWO); // langelis * 2
            number = number.add(langelis);
        }
        return number;
    }

    public static ManoDidelisSkaicius suma3(long x) {
        ManoDidelisSkaicius number = new ManoDidelisSkaicius(1);
        ManoDidelisSkaicius langelis = new ManoDidelisSkaicius(1);
        for (int i = 2; i <= x; i++) {
            langelis.multiply(2); // langelis * 2
            number.add(langelis);
        }

        // langelis.skaitmenys[0] = 123;
        return number;
    }

    // 23123213123231232323
    // 1.6777215E7 = 1.6777215 * 10^7 = 16777215.
    // 1.8446744073709552E19 = 18446744073709552000
    //                         18446744073709551615



}

// int x = 123234;
// String y = "" + x; // "123234"
// char[] x = y.toCharArray() // ['1','2','3',...]
// 0 1 2 3 4 5 6 7 8 9

// int x = 123234;
// int y = x % 10; // 4
// int z = x / 10; // 12323

class ManoDidelisSkaicius {

    // 284
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    //
    private byte[] skaitmenys = new byte[100];

    public ManoDidelisSkaicius(int i) {
        //TODO pabaigti kurti konstruktoriu
        // skaitmenys[0] = ???
        // skaitmenys[1] = ???
    }

    // 284 * 3
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    // -----------------------------------
    // [0] = 2 [1] = 5 [2] = 7 [3] = 0 ...
    public void multiply(int x) {
       //TODO daugyba
    }

    // 284 +
    //  67
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    // [0] = 7 [1] = 6 [2] = 0 [3] = 0 ...
    // -----------------------------------
    // [0] = 1 [1] = 5 [2] = 3 [3] = 0 ...
    public void add(ManoDidelisSkaicius x) {
        //TODO sudetis
    }

}