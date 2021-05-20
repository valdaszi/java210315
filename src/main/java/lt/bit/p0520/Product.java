package lt.bit.p0520;

public class Product {

    private String name;
    private double qty;

    // true - yra naudotinas
    // false - nera naudotinas
    // private boolean valid;

    // 0 - nera naudotinas
    // 1 - yra naudotinas
    // 2 - laukiamas atsakymas del naudojimo
    private int status;

    public Product(String name, double qty, int status) {
        this.name = name;
        this.qty = qty;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public double getQty() {
        return qty;
    }

    public boolean isValid() {
        return status == 1;
    }

    public int getStatus() {
        return status;
    }
}
