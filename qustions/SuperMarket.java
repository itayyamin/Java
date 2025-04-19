import java.util.LinkedList;

public class SuperMarket {

    public static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static class DairyProduct extends Product {
        int expiresAfterDays;

        public DairyProduct(String name, double price, int expiresAfterDays) {
            super(name, price);
            throw new RuntimeException("Not implemented");
        }
    }

    public static class ProductElement{
        Product product;
        int quantity;

        public ProductElement(Product product) {
            throw new RuntimeException("Not implemented");
        }

        public void changeQuantity(int count) {
            throw new RuntimeException("Not implemented");
        }
    }

    public static class CartNode {
        ProductElement productElement;
        CartNode Next;

        public CartNode(ProductElement productElement) {

        }
    }

        public static class Cart {


            public void add(Product product) {
                throw new RuntimeException("Not implemented");
            }

            public int remove(Product product) {
                throw new RuntimeException("Not implemented");
            }

            public int getNumberOfDifferentProducts() {
                throw new RuntimeException("Not implemented");
            }

            public double getTotalPrice() {
                throw new RuntimeException("Not implemented");
            }

            public double getExpiresAfterDays() {
                throw new RuntimeException("Not implemented");
            }


        }

}
