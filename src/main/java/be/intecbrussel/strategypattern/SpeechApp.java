package be.intecbrussel.strategypattern;

import be.intecbrussel.strategypattern.translations.DutchTranslation;
import be.intecbrussel.strategypattern.translations.RomanianTranslation;

public class SpeechApp {
    public static void main(String[] args) {
        Person person = new Person("José", new RomanianTranslation());
        speak(person);
    }

    private static void speak(Person person) {
        System.out.println("How do say hello?");
        person.sayHello();
        System.out.println("How do say goodbye?");
        person.sayGoodbye();
        System.out.println("How do you how are you?");
        person.sayHowAreYou();
    }
}
