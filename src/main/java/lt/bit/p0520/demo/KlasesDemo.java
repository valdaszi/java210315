package lt.bit.p0520.demo;

public class KlasesDemo {

    public static void main(String[] args) {

        Square sq1 = new Square();
        sq1.setA(10);

        System.out.println("Area = " + sq1.getArea());

//        sq1.a = 20;
//        sq1.area = 400;
//        System.out.println("Area = " + sq1.area);

        sq1.setA(20);
        System.out.println("Area = " + sq1.getArea());

        sq1.setColor("Black");
        sq1.setX(123);
        sq1.setY(45);

        System.out.println("Color: " + sq1.getColor());

        System.out.println("Kvadratas: " + sq1.toString());
    }
}


