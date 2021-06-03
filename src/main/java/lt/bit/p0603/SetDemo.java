package lt.bit.p0603;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> setas = new TreeSet<>();
        setas.add("Abc");
        setas.add("Abc1");
        setas.add("Abc2");
        setas.add("Abc1");
        setas.add("Abc2");
        System.out.println(setas.size());
        System.out.println(setas);

        List<Adresas> address = new ArrayList<>();
        address.add(new Adresas("Kaunas", "Europos pr."));
        address.add(new Adresas("Kaunas", "Savanoriu pr."));
        address.add(new Adresas("Vilnius", "Kauno g."));
        address.add(new Adresas("Trakai", "Vilniaus g."));
        address.add(new Adresas("Kaunas", "Vilniaus g."));

        Set<String> cities = new HashSet<>();
        address.forEach(addr -> cities.add(addr.getCity()));
        System.out.println("Viso skirtingu miestu: " + cities.size() +
                ", miestai: " + cities );

    }
}

class Adresas {
    private String city;
    private String street;

    public Adresas(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
