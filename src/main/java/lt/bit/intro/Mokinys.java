package lt.bit.intro;

public class Mokinys extends Zmogus {
    private int klase;  // 0..12
    private String numeris;  // a, b, c

    public Mokinys(String vardas, String pavarde, String adresas,
                   String telefonas, String email, int klase, String numeris) {
        super(vardas, pavarde, adresas, telefonas, email);
        this.klase = klase;
        this.numeris = numeris;
    }

    public int getKlase() {
        return klase;
    }

    public String getNumeris() {
        return numeris;
    }
}
