package be.intecbrussel.factorypattern;

import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("What pizza do you want?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Pizza pizza = PizzaFactory.orderPizza(userInput);

        if (pizza == null) {
            System.out.println("That pizza doesn't exist!");
            return;
        }

        System.out.printf("You ordered a %s pizza and it will cost you %.2f", pizza.getName(), pizza.getPrice());
    }
}
