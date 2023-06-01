package be.intecbrussel.exercises.singletonexercise;

import java.util.ArrayList;
import java.util.List;

public final class Inventory {
    private static Inventory inventory;
    public static Inventory getInstance() {
        if (inventory == null) {
            inventory = new Inventory();
        }

        return inventory;
    }
    private Inventory() {
        productList = new ArrayList<>();
    }


    private List<Product> productList;

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
//        while (productList.contains(product)) {
//            productList.remove(product);
//        }

        // Everything but clean code
        while (productList.remove(product)){}
    }

    public void printList() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
