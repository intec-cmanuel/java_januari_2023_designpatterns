package be.intecbrussel.observerpattern.demo;

public class DemoObserver implements ObserverInterface {
    public String name;

    @Override
    public void update() {
        System.out.println(name + " has been notified!");
    }
}
