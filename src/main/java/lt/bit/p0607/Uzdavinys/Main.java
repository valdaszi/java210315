package lt.bit.p0607.Uzdavinys;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        List<Zmogus> x;
//        Set<Zmogus> y;

        Map<String, Set<Zmogus>> map1 = new TreeMap<>();

        Zmogus z1 = new Zmogus("A1", "B1", "ak1");
        Zmogus z2 = new Zmogus("A2", "B2", "ak2");
        Zmogus z3 = new Zmogus("A3", "B3", "ak3");
        Zmogus z4 = new Zmogus("A4", "B4", "ak4");
        Zmogus z31 = new Zmogus("A31", "B31", "ak3");

//        map1.put(z1.getAk(), z1);
//        map1.put(z4.getAk(), z4);
//        map1.put(z2.getAk(), z2);
//        map1.put(z3.getAk(), z3);
//        map1.put(z31.getAk(), z31);

        put(map1, z1);
        put(map1, z4);
        put(map1, z2);
        put(map1, z3);
        put(map1, z31);
        put(map1, z3);


//        Collection<Zmogus> zmones = map1.values();
//        for (Zmogus z : zmones) {
//            System.out.println(z);
//        }

        Set<String> akodai = map1.keySet();
        for (String ak : akodai) {
            System.out.println(ak + ": " + map1.get(ak));
        }
    }

    static void put(Map<String, Set<Zmogus>> map, Zmogus z) {
//        if (!map.containsKey(z.getAk())) {
//            Set<Zmogus> zmones = new HashSet<>();
//            zmones.add(z);
//            map.put(z.getAk(), zmones);
//        } else {
//            Set<Zmogus> zmones = map.get(z.getAk());
//            zmones.add(z);
////            map.put(z.getAk(), zmones);
//        }

        Set<Zmogus> zmones = map.get(z.ak()); // = map.get(z.ak())
        if (zmones == null) {
            zmones = new HashSet<>();
            map.put(z.ak(), zmones); // map.put(z.ak(), zmones)
        }
        zmones.add(z);
    }
}
