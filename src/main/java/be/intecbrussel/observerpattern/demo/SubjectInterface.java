package be.intecbrussel.observerpattern.demo;

public interface SubjectInterface {
    void attachObserver(ObserverInterface observer);
    void detachObserver(ObserverInterface observer);
    void notifyObservers();
}
