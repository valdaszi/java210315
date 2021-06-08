package lt.bit.p0607.Uzdavinys;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MultiMap<String, Zmogus> map1 = new MultiMap<String, Zmogus>(); //new TreeMap<>();

        Zmogus z1 = new Zmogus("A1", "B1", "ak1");
        Zmogus z2 = new Zmogus("A2", "B2", "ak2");
        Zmogus z3 = new Zmogus("A3", "B3", "ak3");
        Zmogus z4 = new Zmogus("A4", "B4", "ak4");
        Zmogus z31 = new Zmogus("A31", "B31", "ak3");

        map1.put(z1.ak(), z1);
        map1.put(z4.ak(), z4);
        map1.put(z2.ak(), z2);
        map1.put(z3.ak(), z3);
        map1.put(z31.ak(), z31);

        map1.put(z1.ak(), null);

        Set<String> akodai = map1.keySet();
        for (String ak : akodai) {
            System.out.println(ak + ": " + map1.get(ak));
        }
    }

}

//class MultiMap<K, V> extends HashMap<K, Set<V>> {
//
//    public void put1(K key, V value) {
//        Set<V> values = this.get(key);
//        if (values == null) {
//            values = new HashSet<>();
//            this.put(key, values);
//        }
//        values.add(value);
//    }
//
//    @Override
//    public Set<V> put(K key, Set<V> value) {
//        throw new RuntimeException("Ne - ne - ne :)");
//    }
//}

class MultiMap<K, V> {

    private HashMap<K, Set<V>> map = new HashMap<>();

    public void put(K key, V value) {
        Set<V> values = this.get(key);
        if (values == null) {
            values = new HashSet<>();
            this.map.put(key, values);
        }
        values.add(value);
    }

    public Set<K> keySet() {
        return this.map.keySet();
    }

    public Set<V> get(K key) {
        return this.map.get(key);
    }
}
