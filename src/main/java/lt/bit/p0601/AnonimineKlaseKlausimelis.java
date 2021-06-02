package lt.bit.p0601;

public class AnonimineKlaseKlausimelis {

    public static void main(String[] args) {

        // 1) budas

        abstract class A implements I1, I2 {
        }

        A a = new A() {

            @Override
            public int m2() {
                return 100;
            }

            @Override
            public int m1() {
                return 123;
            }
        };

        // 2) budas

        interface X extends I1, I2 {
        }

        X x = new X() {

            @Override
            public int m2() {
                return 200;
            }

            @Override
            public int m1() {
                return 456;
            }
        };


    }
}


interface I1 {
    abstract int m1();
}

interface I2 {
    int m2();
}