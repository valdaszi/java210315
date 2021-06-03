package lt.bit.p0603;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        String e = queue.remove();
        System.out.println("Removed: " + e);
        System.out.println(queue);
    }
}
