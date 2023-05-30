package be.intecbrussel.observerpattern.school;

public interface Subject {
    void attachStudent(Observer observer);
    void detachStudent(Observer observer);
    void notifyStudents(String sentence);
}
