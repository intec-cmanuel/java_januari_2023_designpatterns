package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class PortugeseTranslation implements Translation {
    @Override
    public String translateHello() {
        return "ola";
    }

    @Override
    public String translateGoodbye() {
        return "ciao";
    }

    @Override
    public String translateHowAreYou() {
        return "como vai você";
    }
}
