package lt.bit.p0527.Uzdavinys;

public interface Vardas {

    abstract String vardas();

    default String game() {
        return vardas();
    }

    static String version() {
        return "v0.1";
    }
}
