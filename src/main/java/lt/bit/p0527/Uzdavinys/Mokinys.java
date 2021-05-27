package lt.bit.p0527.Uzdavinys;

public class Mokinys implements Vardas {

    private String firstName;
    private String lastName;

    public Mokinys(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String vardas() {
        return this.firstName + " " + this.lastName;
    }
}
