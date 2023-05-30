package be.intecbrussel.observerpattern.school;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Subject{
    private List<Observer> observerList;

    public Teacher() {
        observerList = new ArrayList<>();
    }

    public void speak(String sentence) {
        System.out.println("TEACHER: " + sentence);
        notifyStudents(sentence);
    }

    @Override
    public void attachStudent(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachStudent(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyStudents(String sentence) {
        for (Observer observer : observerList) {
            observer.update(sentence);
        }
    }
}
