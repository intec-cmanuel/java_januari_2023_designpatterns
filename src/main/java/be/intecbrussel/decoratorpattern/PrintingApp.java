package be.intecbrussel.decoratorpattern;

import be.intecbrussel.decoratorpattern.printerdecorators.TrimmingPrinter;
import be.intecbrussel.decoratorpattern.printerdecorators.UppercasePrinter;

import java.util.Random;

public class PrintingApp {
    public static void main(String[] args) {
        BasicPrinter bp = new BasicPrinter();
        PrinterDecorator uppercase = new UppercasePrinter(bp);
        PrinterDecorator printer = new TrimmingPrinter(uppercase);


        printer.print("    Hello everyone!     ");

        System.out.println(new Random().nextInt(10));
    }
}
