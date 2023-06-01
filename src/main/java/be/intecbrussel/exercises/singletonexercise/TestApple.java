package be.intecbrussel.exercises.singletonexercise;

public class TestApple {
    public static void main(String[] args) {
        Product product = new Product("Apple");
        Product product2 = new Product("Apple");
        Product product3 = new Product("Apple");
        Product product4 = new Product("Apple");
        Product product5 = new Product("Pear");

        Inventory inventory = Inventory.getInstance();
        inventory.addProduct(product);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);
        inventory.addProduct(product5);

        inventory.removeProduct(product);

        inventory.printList();
    }
}
