package lt.bit.p0603;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> listas = new ArrayList<>();
        listas.add("Abc 0");
        listas.add(0, "Abc 1");
        System.out.println(listas.size());
        System.out.println(listas);
        listas.remove("Abc 0");
        listas.add("Abc");
        listas.add("Abc");
        listas.add(0, "Abc");
        System.out.println(listas);

        System.out.println("indexOf('Abc 1') = " + listas.indexOf("Abc 1"));
        System.out.println("indexOf('Abc 2') = " + listas.indexOf("Abc 2"));

        System.out.println("for ...");
        for (String s : listas) {
            System.out.println(s);
        }

        System.out.println("forEach ...");
        listas.forEach(s -> System.out.println(s));
    }
}
