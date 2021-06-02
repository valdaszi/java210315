package lt.bit.p0602;

import java.time.LocalDate;

public class DinaminiaiMasyvai {

    public static void main(String[] args) {

        StringList listas = new StringArrayList();
        for (int i = 1; i <= 1000; i++) {
            listas.add("Abc" + i);
        }
        System.out.println(listas.size());
        System.out.println(listas.get(0));
        System.out.println(listas.get(999));

        listas.remove(0);
        System.out.println(listas.get(0));


        List<LocalDate> datos = new ArrayList<LocalDate>();
        for (int i = 1; i <= 1000; i++) {
            datos.add(LocalDate.now().minusDays(i));
        }
        System.out.println(datos.get(0));
        System.out.println(datos.get(999));



        List<Integer> integeriai = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            integeriai.add(i);
        }
        System.out.println(integeriai.get(999));



        List<X> xxx = new ArrayList<>();


//        List<List<List<String>>> superListas = new ArrayList<>();
//
//        superListas.get(0); // List<List<String>>
//        superListas.get(0).get(1); // List<String>
//        superListas.get(0).get(1).get(1); // String

    }
}

class X {
    int a;
    int b;
}
