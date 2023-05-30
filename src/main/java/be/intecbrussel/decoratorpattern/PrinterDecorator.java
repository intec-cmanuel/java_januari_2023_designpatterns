package be.intecbrussel.decoratorpattern;

import java.util.List;

public abstract class PrinterDecorator implements Printer {
    private Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String sentence) {
        printer.print(sentence);
    }

    public void print(List<String> sentences) {
        for (String sentence : sentences) {
            print(sentence);
        }
    }
}
