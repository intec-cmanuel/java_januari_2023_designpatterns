package be.intecbrussel.decoratorpattern;

public class BasicPrinter implements Printer {
    @Override
    public void print(String sentence) {
        System.out.println(sentence);
    }
}
