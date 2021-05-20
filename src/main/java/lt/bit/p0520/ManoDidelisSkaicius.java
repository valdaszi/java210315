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
    public ManoDidelisSkaicius multiply(int x) {
        //TODO daugyba
        return this;
    }

    // 284 +
    //  67
    // [0] = 4 [1] = 8 [2] = 2 [3] = 0 ...
    // [0] = 7 [1] = 6 [2] = 0 [3] = 0 ...
    // -----------------------------------
    // [0] = 1 [1] = 5 [2] = 3 [3] = 0 ...
    public ManoDidelisSkaicius add(ManoDidelisSkaicius x) {
        //TODO sudetis
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
