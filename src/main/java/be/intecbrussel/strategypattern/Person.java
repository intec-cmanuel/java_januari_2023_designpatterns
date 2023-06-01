package be.intecbrussel.strategypattern;

import be.intecbrussel.strategypattern.translations.EnglishTranslation;

public class Person {
    private String name;
    private Translation language;

    public Person(String name, Translation translation) {
        this.language = translation;
        this.name = name;
    }

    public void sayHello() {
        System.out.println(language.translateHello());
    }

    public void sayGoodbye() {
        System.out.println(language.translateGoodbye());
    }

    public void sayHowAreYou() {
        System.out.println(language.translateHowAreYou());
    }

}
