package be.intecbrussel.observerpattern.school;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {
    private String name;
    private List<String> notes;

    public Student(String name) {
        this.name = name;
        this.notes = new ArrayList<>();
    }

    public void readNotes() {
        for (String note : notes) {
            System.out.println(note);
        }
    }

    @Override
    public void update(String sentence) {
        notes.add(sentence);
    }
}
