package lt.bit.p0531;

//final public class Color {
//
//    public static final Color YELLOW = new Color("YELLOW");
//    public static final Color BLACK = new Color("BLACK");
//    public static final Color WHITE = new Color("WHITE");
//
//
//    final private String name;
//
//    private Color(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Color{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

public enum Color {
    BLACK(0, 0, 0),
    WHITE(255, 255, 255),
    YELLOW(255, 255, 0);

    private int r, g, b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
