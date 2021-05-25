package lt.bit.p0524;

public class Zmogus extends Object {

    private String name;
    private String email;

    public Zmogus(String name, String email) {
        this.name = name;
        this.email = email;
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
        return this.name != null && z.name != null &&
                this.name.trim().equalsIgnoreCase(z.name.trim()) &&
                this.email != null && z.email != null &&
                this.email.trim().equalsIgnoreCase(z.email.trim());
    }

}
