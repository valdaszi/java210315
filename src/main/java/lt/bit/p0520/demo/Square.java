package lt.bit.p0520.demo;

public class Square extends Figura {

    private double a;
    private double area;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        // patikriname userio teises
        this.a = a;
        this.area = a * a;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String getColor() {
        return super.getColor() + " & White";
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + ", " +
                "a=" + a +
                ", area=" + area +
                '}';
    }
}
