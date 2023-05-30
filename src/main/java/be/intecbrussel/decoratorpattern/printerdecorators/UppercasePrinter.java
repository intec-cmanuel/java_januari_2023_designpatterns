package be.intecbrussel.decoratorpattern.printerdecorators;

import be.intecbrussel.decoratorpattern.Printer;
import be.intecbrussel.decoratorpattern.PrinterDecorator;

import java.util.List;

public class UppercasePrinter extends PrinterDecorator {
    public UppercasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String sentence) {
        super.print(sentence.toUpperCase());
    }

    @Override
    public void print(List<String> sentences) {
        List<String> copy = List.copyOf(sentences);
        for (String sentence : copy) {
            sentence.replace(sentence, sentence.toUpperCase());
        }

        super.print(sentences);
    }
}
