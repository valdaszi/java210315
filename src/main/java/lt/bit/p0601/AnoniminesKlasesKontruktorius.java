package lt.bit.p0601;

public class AnoniminesKlasesKontruktorius {

    public static void main(String[] args) {

        A1 a = new A1(100) {

            @Override
            public int getX() {
                return super.getX() * 2;
            }
        };

        A1 a2 = new A1(100, 200) {

            @Override
            public int getX() {
                return super.getX() / 2;
            }
        };

        class B1 extends A1 {
            public B1(int x) {
                super(x);
            }

            public B1(int x, int y) {
                super(x, y);
            }
        }

    }
}


abstract class A1 {
    private int x;

    public A1(int x) {
        this.x = x;
    }

    public A1(int x, int y) {
        this.x = x + y;
    }

    public int getX() {
        return x;
    }
}