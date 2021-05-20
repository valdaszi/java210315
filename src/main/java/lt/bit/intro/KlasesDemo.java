package lt.bit.intro;

public class KlasesDemo {

    public static void main(String[] args) {

        Man jonas = new Man("Jonas", "Jonaitis");
//        jonas.firstName = "Jonas";
//        jonas.lastName = "Jonaitis";
        System.out.println(jonas.firstName + " " + jonas.lastName);

        Man jonas2 = jonas;
        jonas2.firstName = "Jonas 2";
        System.out.println(jonas.firstName + " " + jonas.lastName);

        Product p1 = new Product();
        System.out.println(p1.name + " " + p1.qty + " " + p1.valid);

        Man ona = new Man("Ona V");
        Man x = new Man();

    }
}

class Man {
    String firstName;
    String lastName;

    Man(String name) {
        firstName = name;
    }

    Man(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Man() {
    }
}

class Product {
    String name;
    double qty;
    boolean valid;

    Product() {
        valid = false;
    }
}


