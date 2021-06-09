package lt.bit.p0608;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MultiThreadCollectionsDemo {

    public static void main(String[] args) {
        List<Integer> listas = Collections.synchronizedList(new ArrayList<>());
        MultiThreadCollectionsDemo obj = new MultiThreadCollectionsDemo();

//        obj.add(listas);
//        obj.add(listas);
//        obj.add(listas);
//        obj.add(listas);
//        obj.add(listas);

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> obj.add(listas));
            threads.add(thread);
            thread.start();
        }
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(listas.size());
    }

    void add(List<Integer> listas) {
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            listas.add(random.nextInt());
        }
        System.out.println(Thread.currentThread().getName() + ": end");
    }
}
