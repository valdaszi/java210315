package lt.bit.p0527;

public class AbstraktiKlaseDemo {
}


interface ManoInterfeisas {

    void m1();

    public abstract int m2(int x, String s);

    default int m3() {
        return (int) Math.floor(Math.random() * 100);
    }
}

abstract class ManoAbstraktiKlase {

    public abstract void m1();

    protected abstract int m2(int x, String s);

    int m3() {
        return (int) Math.floor(Math.random() * 100);
    }
}


abstract class ManoPrivalomaiAbstraktiKlase implements ManoInterfeisas {

    public void m1() {
        System.out.println("M1");
    }
}

abstract class ManoKitaPrivalomaiAbstraktiKlase {

    public void m2() {
        System.out.println("M2");
    }

    abstract protected int m3(int x, int y);
}

abstract class NormaliKlase {
    private int a;

    public NormaliKlase(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
