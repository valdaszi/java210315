package lt.bit.p0614;

import java.util.*;

public final class FinalDemo {

    private final int x = 123;  // A varijantas - 1 zingsnis
    private final int y;
    private final int z;
    private int a = 1;

    // B - 3 zingsnis
    public FinalDemo(int y) {
        // ...
        System.out.println("FinalDemo(): a=" + a);
        this.y = y;
        this.a = 10;
        System.out.println("FinalDemo(): a=" + a);
    }

    // C -  2 zingsnis
    {
        System.out.println("{}: a=" + a);
        z = 456;
        a++;
        System.out.println("{}: a=" + a);
    }

    {
        System.out.println("{}");
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getA() {
        return a;
    }

//    public void setA(int a) {
//        this.a = a;
//    }

    public static void main(String[] args) {
        FinalDemo demo = new FinalDemo(1);
        System.out.println(demo.a);

        // galima sukurti nemutuojanti lista:
        try {
            List<Integer> listas = List.of(101, 102, 103);
            listas.add(111);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // galima sukurti nemutuojanti seta:
        try {
            Set<String> set = Set.of("Abc", "Def");
            set.add("Xyz");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

abstract class A {

}

class Demo {

    void m() {
        FinalDemo demo = new FinalDemo(1);
        // ...
        m2(demo);
        // ...
    }

    void m2(FinalDemo demo) {
        // TODO
        // demo.setA(12345);
    }
}



