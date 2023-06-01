package be.intecbrussel.exercises.decoratorexercise;

public class App {
    public static void main(String[] args) {
        RealChristmasTree realChristmasTree = new RealChristmasTree();
        TreeTopper treeTopper = new TreeTopper(realChristmasTree);
        Garland garland = new Garland(treeTopper);
        BubbleLights bubbleLights = new BubbleLights(garland);
        TreeTopper treeTopper1 = new TreeTopper(bubbleLights);

        System.out.println(realChristmasTree.decorate());
        System.out.println(treeTopper1.decorate());
    }
}
