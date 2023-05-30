package be.intecbrussel.decoratorpattern.printerdecorators;

import be.intecbrussel.decoratorpattern.Printer;
import be.intecbrussel.decoratorpattern.PrinterDecorator;

public class TrimmingPrinter extends PrinterDecorator {
    public TrimmingPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String sentence) {
        super.print(sentence.trim());
    }
}
