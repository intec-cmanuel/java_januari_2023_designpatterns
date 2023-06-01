package be.intecbrussel.compositepattern;

public class TestApp {
    public static void main(String[] args) {
        Drawable circle = new Circle();
//        circle.addDrawing(new Rectangle());
        circle.draw();
    }
}
