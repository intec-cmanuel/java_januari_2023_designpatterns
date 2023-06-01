package be.intecbrussel.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Drawable {
    private List<Drawable> drawings;

    public Drawing() {
        drawings = new ArrayList<>();
    }

    public void draw() {
        for (Drawable drawing : drawings) {
            drawing.draw();
        }
    }

    public void addDrawing(Drawable drawing) {
        drawings.add(drawing);
    }
}
