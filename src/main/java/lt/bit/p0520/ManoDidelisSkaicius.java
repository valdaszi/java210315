package lt.bit.p0520;

public class ManoDidelisSkaicius {

    // 284
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    //
    private byte[] skaitmenys = new byte[100];

    //   0  1  2  3  4  5  6  7  8  9
    //  48 49 50 51 52 53 54 55 56 57

    // 284
    public ManoDidelisSkaicius(int i) {
//        String s = String.valueOf(i); // "284"
//        for (int k = s.length() - 1, x = 0; k >= 0; k--, x++) {
//            skaitmenys[x] = (byte) (s.charAt(k) - '0');
//        }

        int x = 0;
        while (i > 0) {
            skaitmenys[x++] = (byte) (i % 10);
            i /= 10;
        }

//        for (int x = 0; i > 0; x++, i /= 10) {
//            skaitmenys[x] = (byte) (i % 10);
//        }

    }

    // 284 * 3
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    // -----------------------------------
    // [0] = 2 [1] = 5 [2] = 7 [3] = 0 ...

    //
    // 1234
    //   28
    // ----
    // ..52
    // 1) 28 * 4 = 112 -> 2 (11)
    // 2) 28 * 3 + 11 = 95 -> 5 (9)
    public ManoDidelisSkaicius multiply(int x) {
        int mintyje = 0;
        for (int index = 0; index < skaitmenys.length; index++) {
            int sandauga = mintyje + skaitmenys[index] * x;
            skaitmenys[index] = (byte) (sandauga % 10);
            mintyje = sandauga / 10;
        }
        if (mintyje > 0) {
            System.err.println("Klaida - gaunasi per didelis skaicius");
        }
        return this;
    }

    // 284 +
    //  67
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    // [0] = 7 [1] = 6 [2] = 0 [3] = 0 ...
    // -----------------------------------
    // [0] = 1 [1] = 5 [2] = 3 [3] = 0 ...

    //  1
    // 996
    // 108
    // ---
    //  04

    // Jei suma <  10 tai mintyje = 0; skaitmenys[index] = suma;
    // Jei suma >= 10 tai mintyje = ?; skaitmenys[index] = ?
    public ManoDidelisSkaicius add(ManoDidelisSkaicius x) {
        int mintyje = 0;
        for (int index = 0; index < skaitmenys.length; index++) {
             int suma = mintyje + skaitmenys[index] + x.skaitmenys[index];
//             if (suma < 10) {
//                 mintyje = 0;
//                 skaitmenys[index] = (byte) suma;
//             } else {
//                 mintyje = 1;
//                 skaitmenys[index] = (byte) (suma - 10);
//             }
             skaitmenys[index] = (byte) (suma % 10);
             mintyje = suma / 10;
        }
        if (mintyje > 0) {
            System.err.println("Klaida - gaunasi per didelis skaicius");
        }
        return this;
    }

    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...  -> 0000284
    public String toString() {
        int index = findNoneZero();
        if (index == -1) return "0";

        String result = "";
        for ( ; index >= 0; index--) {
            result += skaitmenys[index];
        }

        return result;
    }

    private int findNoneZero() {
        for (int i = skaitmenys.length - 1; i >= 0; i--) {
            if (skaitmenys[i] != 0) return i;
        }
        return -1;
    }
}
