package lt.bit.p0608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionDeleteDemo {

    public static void main(String[] args) {

        Collection<Integer> listas = new ArrayList<>(Arrays.asList(100, -4, 10, -9, 8, -6, 8));
        System.out.println(listas);


//        for (Integer i : listas) {
//            if (i < 0) listas.remove(i);
//        }

//        List<Integer> naujasListas = new ArrayList<>();
//        for (Integer i : listas) {
//            if (i >= 0) naujasListas.add(i);
//        }
//        listas = naujasListas;

//        listas.removeIf(i -> i < 0)


        // reikia ismesti visus neigiamus, o teigiamus padvigubinti

        listas = listas.stream()
                .filter(e -> e >= 0)
                .map(e -> e * 2)
                .collect(Collectors.toSet());

        System.out.println(listas);
    }
}
