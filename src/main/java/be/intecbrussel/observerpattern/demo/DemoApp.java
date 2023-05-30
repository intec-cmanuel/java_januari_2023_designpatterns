package be.intecbrussel.observerpattern.demo;

public class DemoApp {
    public static void main(String[] args) {
        DemoSubject subject = new DemoSubject();
        DemoObserver observer1 = new DemoObserver();
        DemoObserver observer2 = new DemoObserver();
        DemoObserver observer3 = new DemoObserver();
        DemoObserver observer4 = new DemoObserver();
        DemoObserver observer5 = new DemoObserver();

        observer1.name = "o1";
        observer2.name = "o2";
        observer3.name = "o3";
        observer4.name = "o4";
        observer5.name = "o5";

        subject.attachObserver(observer1);
        subject.attachObserver(observer2);
        subject.attachObserver(observer3);
        subject.attachObserver(observer4);
        subject.attachObserver(observer5);

        subject.detachObserver(observer4);

        subject.notifyObservers();
    }
}
