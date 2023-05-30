package be.intecbrussel.factorypattern;

public abstract class Pizza {
    private String name;
    private double price;

    public Pizza (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
