package be.intecbrussel.observerpattern.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoSubject implements SubjectInterface {
    private List<ObserverInterface> observerList = new ArrayList<>();

    @Override
    public void attachObserver(ObserverInterface observer) {
        observerList.add(observer);
    }

    @Override
    public void detachObserver(ObserverInterface observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(ObserverInterface::update);
    }
}
