package lt.bit.p0603;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, ZmogusInfo> mapas = new HashMap<>();
        mapas.put("123", new ZmogusInfo("123", "Ona", LocalDate.of(2000, 12, 31)));
        mapas.put("124", new ZmogusInfo("124", "Jonas", LocalDate.of(1999, 4, 15)));
        mapas.put("123", new ZmogusInfo("123", "Ona", LocalDate.of(2010, 1, 1)));
        mapas.put("000", new ZmogusInfo("000", "XXX", LocalDate.of(2020, 1, 1)));

        System.out.println("size: " + mapas.size());
        System.out.println("keys: " + mapas.keySet());
        System.out.println("values: " + mapas.values());

        System.out.println(mapas);
    }
}

record ZmogusInfo(
        String ak,
        String name,
        LocalDate birthday
) {
}
