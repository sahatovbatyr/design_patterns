package com.patterns.memento2.shapes;

/**
 * Created by Sahatov Batyr on 25.03.2019.
 */
import java.awt.*;

public class Dot extends BaseShape {
    private static final long serialVersionUID = 2170193766299571991L;
    private final int DOT_SIZE = 3;

    public Dot(int x, int y, Color color) {
        super(x, y, color);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }
}