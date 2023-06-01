package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class FrenchTranslation implements Translation {
    @Override
    public String translateHello() {
        return "bonjour";
    }

    @Override
    public String translateGoodbye() {
        return "au revoir";
    }

    @Override
    public String translateHowAreYou() {
        return "comment ça va";
    }
}
