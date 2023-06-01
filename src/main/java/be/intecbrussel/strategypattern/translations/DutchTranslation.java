package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class DutchTranslation implements Translation {
    @Override
    public String translateHello() {
        return "hallo";
    }

    @Override
    public String translateGoodbye() {
        return "tot ziens";
    }

    @Override
    public String translateHowAreYou() {
        return "hoe gaat het";
    }
}
