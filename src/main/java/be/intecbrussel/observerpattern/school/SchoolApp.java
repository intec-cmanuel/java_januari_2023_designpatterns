package be.intecbrussel.observerpattern.school;

public class SchoolApp {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Student student1 = new Student("Bob");
        Student student2 = new Student("Jean");
        Student student3 = new Student("Max");
        Student student4 = new Student("Bobette");
        Student student5 = new Student("Karl Marx");

        teacher.attachStudent(student1);
        teacher.attachStudent(student2);
        teacher.attachStudent(student3);
        teacher.attachStudent(student4);
        teacher.attachStudent(student5);

        teacher.speak("4 + 4 = 8");
        teacher.speak("However some people claim it is equal to 44");
        teacher.speak("No Bogdan, math is not racist. It's straight up facts.");

        teacher.detachStudent(student3);

        teacher.speak("Max ran away once again");

        teacher.attachStudent(student3);

        teacher.speak("Alright, let's continue");

        student1.readNotes();
        System.out.println("----------");
        student3.readNotes();
    }
}
