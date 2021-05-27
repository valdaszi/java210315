package lt.bit.p0527.Uzdavinys;

public class Pora implements Vardas {

    private static int counter;

    private int number;

    private Vardas g1;
    private Vardas g2;

    public Pora(Vardas g1, Vardas g2) {
        this.number = ++counter;
        this.g1 = g1;
        this.g2 = g2;
    }

    @Override
    public String vardas() {
        return number + " poros laimetoja/as";
    }

    public String game() {
        return number + ") " + g1.vardas() + " - " + g2.vardas();
    }
}
