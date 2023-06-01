package be.intecbrussel.exercises.decoratorexercise;

public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with bubbly lights";
    }
}
