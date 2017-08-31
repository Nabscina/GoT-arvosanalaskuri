package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Colour {

    private ArrayList<Color> colors;
    private Random random;

    public Colour() {

        random = new Random();
        colors = new ArrayList<>();
        Collections.addAll(colors, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.PINK, Color.RED,
                Color.ORANGE, Color.CYAN, Color.DARK_GRAY, Color.BLACK);
    }

    public Color getColor() {

        return colors.get(random.nextInt(colors.size()));
    }

}
