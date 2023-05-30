package be.intecbrussel.singletonpattern;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();

        logger.log("CREATING ARRAY");
        int[] intArray = new int[3];
        intArray[0] = 5;
        intArray[2] = 6;
        logger.log("CREATED ARRAY: " + Arrays.toString(intArray));

        boolean contains0 = containsZero(intArray);
        logger.log("FOUND ZERO? " + contains0);

        if (contains0) {
            System.out.println("It contains zero");
        } else {
            System.out.println("It doesn't contain zero");
        }

        logger.printLogs();
    }

    public static boolean containsZero(int[] array) {
        Logger logger = Logger.getLogger();

        logger.log("Before forloop: " + Arrays.toString(array));
        for (int i : array) {
            logger.log("i: " + i);
            if (i == 0) {
                return true;
            }
        }
        logger.log("NO ZERO FOUND!");

        return false;
    }
}
