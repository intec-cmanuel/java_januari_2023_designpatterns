package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class RomanianTranslation implements Translation {
    @Override
    public String translateHello() {
        return "Bonjour";
    }

    @Override
    public String translateGoodbye() {
        return "La revedere";
    }

    @Override
    public String translateHowAreYou() {
        return "ce face";
    }
}
