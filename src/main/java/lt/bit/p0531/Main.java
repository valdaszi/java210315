package lt.bit.p0531;

public class Main {

    public static void main(String[] args) {
        Zmogus zmogus = new Zmogus("Jonas", "Jonaitis");
        System.out.println(zmogus);

        Zmogus zmogus2 = new Zmogus("Jonas", "Jonas");
        System.out.println("zmogus equals zmogus2 ? " + zmogus.equals(zmogus2));
        System.out.println("zmogus == zmogus2 ? " + (zmogus == zmogus2));

        zmogus2 = new Zmogus("Jonas", "Jonaitis");
        System.out.println("zmogus equals zmogus2 ? " + zmogus.equals(zmogus2));
        System.out.println("zmogus == zmogus2 ? " + (zmogus == zmogus2));


        Figure f1 = new Figure();
        f1.setPosition(new Position(0, 0));
        f1.setColor(Color.YELLOW); //  new Color("Yellow"));

        Figure f2 = new Figure();
        f2.setPosition(new Position(0, 0));
        f2.setColor(Color.YELLOW); //  new Color("yelow"));

        System.out.println("f1 equals f2 = " + f1.equals(f2));

        System.out.println("f1.color == f2.color ? " + (f1.getColor() == f2.getColor()));

        System.out.println(f1.getColor().name());
        System.out.println(f1.getColor().toString());
        System.out.println(f1.getColor().ordinal());


    }
}
