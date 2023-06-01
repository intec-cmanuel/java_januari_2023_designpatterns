package be.intecbrussel.exercises.decoratorexercise;

public class RealChristmasTree implements ChristmasTree{

    @Override
    public String decorate() {
        return "Christmas tree";
    }
}
