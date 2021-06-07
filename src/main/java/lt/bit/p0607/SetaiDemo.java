package lt.bit.p0607;

import lt.bit.p0607.Uzdavinys.Zmogus;

import java.util.*;

public class SetaiDemo {

    public static void main(String[] args) {

        Zmogus z1 = new Zmogus("A1", "B1", "ak1");
        Zmogus z2 = new Zmogus("A2", "B2", "ak2");
        Zmogus z3 = new Zmogus("A3", "B3", "ak3");
        Zmogus z4 = new Zmogus("A4", "B4", "ak4");
        Zmogus z31 = new Zmogus("A31", "B31", "ak3");

        Collection<Zmogus> zmones = new TreeSet<>();

        zmones.add(z1);
        zmones.add(z2);
        zmones.add(z3);
        zmones.add(z4);
        zmones.add(z31);
        zmones.add(z1);
        zmones.add(z3);
        System.out.println("size = " + zmones.size());

        zmones.add(new Zmogus("A1", "B1", "ak1"));
        System.out.println("size = " + zmones.size());

        System.out.println(zmones);

//        Zmogus z = new Zmogus("A1", "B1", "ak1");
//        System.out.println("== ? " + (z == z1));
//        System.out.println("equals ? " + z.equals(z1));

//        System.out.println(z1.hashCode());
//        System.out.println(new Zmogus("A1", "B1", "ak1").hashCode());

//        G<X> gx = new G<>();
//        G<X1> gx1 = new G<>();
//        G<Y> gy = new G<>();
//        G<Z> gz = new G<>();
    }
}

class G<E extends X & IX> {
    E attr;
}

interface IX {
}

class X implements IX {
}

class X1 extends X {
}

class Y implements IX {
}

class Z {
}
