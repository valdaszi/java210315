public class Mokytojas extends Zmogus {
    private String dalykas;

    public Mokytojas(String vardas, String pavarde, String adresas, String telefonas,
                     String email, String dalykas) {
        super(vardas, pavarde, adresas, telefonas, email);
        this.dalykas = dalykas;
    }

    public String getDalykas() {
        return dalykas;
    }
}
