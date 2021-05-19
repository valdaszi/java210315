public class Zmogus extends Object {
    private String vardas;
    private String pavarde;
    private String adresas;
    private String telefonas;
    private String email;

//    public Zmogus() {
//
//    }

    public Zmogus(String vardas, String pavarde, String adresas, String telefonas, String email) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.telefonas = telefonas;
        this.email = email;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getAdresas() {
        return adresas;
    }

    public String getTelefonas() {
        return telefonas;
    }

    public String getEmail() {
        return email;
    }
}
