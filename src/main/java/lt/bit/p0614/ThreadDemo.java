package lt.bit.p0614;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("I am in thread " + Thread.currentThread().getName());

        Thread thread = new Thread(new R());
        thread.start();

        D d = new D();
        Object key = new Object();
        new Thread(() -> {
            synchronized (key) {
                d.m();
            }
        }).start();
        new Thread(() -> {
            synchronized (key) {
                d.m();
            }
        }).start();
        new Thread(() -> {
            synchronized (key) {
                System.out.println("I'm running in " + Thread.currentThread().getName() + " :)");
            }
        }, "My Thread name").start();

        thread.join();

        System.out.println("The end.");
        System.out.println("""
                Java Multiline
                Text
                """);
    }


}

class R implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in " + Thread.currentThread().getName());
    }
}

class D {
    void m() {
        System.out.println("I'm running in " + Thread.currentThread().getName());
    }
}
