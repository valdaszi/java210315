package lt.bit.p0520;

public class LygiavimoUzdavinys {

    public static void main(String[] args) {
        System.out.println(LygiavimoUzdavinys.class.getName());

        ProductService productService = new ProductService();
        Product[] products = productService.getProducts();

        productService.sort(products);

        print(products);
    }

    static void print(Product[] products) {
        for (Product p : products) {
            System.out.println(p.isValid() + " " + p.getQty() + " " + p.getName());
        }
    }

}
