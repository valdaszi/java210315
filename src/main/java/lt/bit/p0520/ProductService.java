package lt.bit.p0520;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ProductService {

    public Product[] getProducts() {
        return new Product[] {
                new Product("Agurkai", 1.5, 1),
                new Product("Agurkai", 0.5, 2),
                new Product("Morkos", 3., 1),
                new Product("Arbuzai", 3., 1),
                new Product("Obuoliai", 3., 1),
                new Product("Burokai", 5., 1),
                new Product("Zirniai", 9., 0)
        };
    }

    // i
    // 7 5 4 2 6
    // 5 7 4 2 6
    // 4 7 5 2 6
    // 2 7 5 4 6

    // 2
    public void sort(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            for (int j = i + 1; j < products.length; j++) {
                // if (products[i] > product[j]) products[i] <-> product[j]
                if (compare(products[i], products[j]) > 0) {
                    Product p = products[i];
                    products[i] = products[j];
                    products[j] = p;
                }
            }
        }

//        Arrays.sort(products, this::compare);

//        Arrays.sort(products, (a, b) -> {
//            if (a.isValid() && !b.isValid()) return -1;
//            if (!a.isValid() && b.isValid()) return 1;
//
//            // a.isValid() == b.isValid()
//            if (a.getQty() > b.getQty()) return -1;
//            if (a.getQty() < b.getQty()) return 1;
//
//            // a.isValid() == b.isValid() && a.getQty() == b.getQty()
//            return a.getName().compareTo(b.getName());
//        });

//        Arrays.sort(products,
//                Comparator.comparing(Product::isValid).reversed()
//                .thenComparing(Product::getQty).reversed()
//                .thenComparing(Product::getName));
    }

    // valid (true eina pirmiau false)
    // qty (didesni eina pirmaisu mazesniu)
    // name (pagal zodyna)

    /*
        Products:
            true  3.0 Agurkas
            false 2.0 Betkas
            true  1.0 Arbuzas
            true  3.0 Morka

        Sorted:
            true  3.0 Agurkas   1
            true  3.0 Morka     2
            true  1.0 Arbuzas   3
            false 2.0 Betkas    4
     */

    // a < b   -n
    // a == b  0
    // a > b   +n
    private int compare(Product a, Product b) {
        if (a.isValid() && !b.isValid()) return -1;
        if (!a.isValid() && b.isValid()) return 1;

        // a.isValid() == b.isValid()
        if (a.getQty() > b.getQty()) return -1;
        if (a.getQty() < b.getQty()) return 1;

        // a.isValid() == b.isValid() && a.getQty() == b.getQty()
        return a.getName().compareTo(b.getName());
    }
 }
