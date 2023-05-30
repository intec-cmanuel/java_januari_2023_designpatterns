package be.intecbrussel.factorypattern;

public class PizzaFactory {
    public static Pizza orderPizza(String name) {
        switch (name) {
            case "Pepperoni":
                return new PepperoniPizza();
            case "Mozzarella" :
                return new MozzarellaPizza();
            case "Veggie" :
                return new VeggiePizza();

            default:
                return null;
        }

    }
}
