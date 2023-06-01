package be.intecbrussel.compositepattern;

public class App {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();

        Drawing face = new Drawing();
        face.addDrawing(c1);
        face.addDrawing(c1);
        face.addDrawing(c1);
        face.addDrawing(r1);

//        face.draw();

        Drawing head = new Drawing();
        head.addDrawing(face);
        head.addDrawing(t1);

//        head.draw();

        Drawing person = new Drawing();
        person.addDrawing(head);
        person.addDrawing(r1);
        person.addDrawing(r1);
        person.addDrawing(r1);
        person.addDrawing(r1);
        person.addDrawing(r1);

        person.draw();
    }
}
