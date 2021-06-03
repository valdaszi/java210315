package lt.bit.p0602;

import java.util.Arrays;

public class SpeedTest {

    static final public int MAX_LIST_SIZE = 100000;

    public static void main(String[] args) {
        test(new ArrayList<>());
        test(new ArrayList<>(100));
        test(new ArrayList<>(100000));
        test(new LinkedList<>());
    }

    static void test(List<String> listas) {
        long start = System.nanoTime();

        for (int i = 0; i < SpeedTest.MAX_LIST_SIZE; i++) {
            listas.add("abc - " + i);
        }
        listas.remove(10);
        listas.remove(1000);

        String[] res = new String[] {
                listas.get(0),
                listas.get(10),
                listas.get(1000),
                listas.get(listas.size() - 1)
        };

        long time = System.nanoTime() - start;

        System.out.println("time: " + time / 1000000 + "ms");
        System.out.println(Arrays.toString(res));
    }
}
