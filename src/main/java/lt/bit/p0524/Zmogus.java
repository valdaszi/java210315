package lt.bit.p0524;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Zmogus extends Object {

    private String name;
    private String email;
    private LocalDate birthday;

    public static Zmogus createFromNameAndEmail(String name, String email) {
        Zmogus z = new Zmogus(name, email);
        return z;
    }

    public Zmogus(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public Zmogus(String name, String email, LocalDate birthday) {
        this(name, email);
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "vardas: " + name + ", email: " + email;
    }

    @Override
    public boolean equals(Object o) {
        // if (o == null) return false;
        if (!(o instanceof Zmogus)) return false;
        Zmogus z = (Zmogus) o;

        return
                Objects.equals(
                        this.name == null ? "" : this.name.trim().toLowerCase().replaceAll("\\s+", " "),
                        z.name == null ? "" : z.name.trim().toLowerCase().replaceAll("\\s+", " ")) &&
                Objects.equals(
                        this.email == null ? "" : this.email.trim().toLowerCase(),
                        z.email == null ? "" : z.email.trim().toLowerCase());

//        return this.name != null && z.name != null &&
//                this.name.trim().equalsIgnoreCase(z.name.trim()) &&
//                this.email != null && z.email != null &&
//                this.email.trim().equalsIgnoreCase(z.email.trim());
    }

    public int age(LocalDate date) {
        return Period.between(birthday, date).getYears();
    }
}
