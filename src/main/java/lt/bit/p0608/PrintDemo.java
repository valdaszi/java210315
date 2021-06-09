package lt.bit.p0608;

public class PrintDemo {

    /*
            1   1   1   1   1
            2   2   2   2   2
            ....
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                // System.out.print(i + " x " + j + " = " + i * j + "\t");
                System.out.printf("  %2d x %2d = %2d  ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
