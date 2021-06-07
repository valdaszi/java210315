package lt.bit.p0607.Uzdavinys;

import java.util.Comparator;
import java.util.Objects;

public record Zmogus(
        String vardas,
        String pavarde,
        String ak
) implements Comparable<Zmogus> {

    @Override
    public int compareTo(Zmogus o) {
        return Comparator.comparing(Zmogus::pavarde)
                .thenComparing(Zmogus::vardas)
                .thenComparing(Zmogus::ak)
                .compare(this, o);
    }
}

//public class Zmogus implements Comparable<Zmogus> {
//    private String vardas;
//    private String pavarde;
//    private String ak;
//
//    public Zmogus(String vardas, String pavarde, String ak) {
//        this.vardas = vardas;
//        this.pavarde = pavarde;
//        this.ak = ak;
//    }
//
//    public String getVardas() {
//        return vardas;
//    }
//
//    public String getPavarde() {
//        return pavarde;
//    }
//
//    public String getAk() {
//        return ak;
//    }
//
//    @Override
//    public String toString() {
//        return "Zmogus{" +
//                "vardas='" + vardas + '\'' +
//                ", pavarde='" + pavarde + '\'' +
//                ", ak='" + ak + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Zmogus zmogus = (Zmogus) o;
//        return Objects.equals(getVardas(), zmogus.getVardas()) &&
//                Objects.equals(getPavarde(), zmogus.getPavarde()) &&
//                Objects.equals(getAk(), zmogus.getAk());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getVardas(), getPavarde(), getAk());
//    }
//
//    // < 0 - this < o
//    //   0 - this = o
//    // > 0 - this > o
//    @Override
//    public int compareTo(Zmogus o) {
//        if (equals(o)) return 0;
//        // pirma lyginam pavarde
//        int cmp = getPavarde().compareTo(o.getPavarde());
//        if (cmp != 0) return cmp;
//        // jei pavardes lygios tai lyginam vardus
//        cmp = getVardas().compareTo(o.getVardas());
//        if (cmp != 0) return cmp;
//        // jei vardai lygus tai lyginam ak
//        return getAk().compareTo(o.getAk());
//    }
//}
