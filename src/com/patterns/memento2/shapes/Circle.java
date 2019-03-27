package com.patterns.memento2.shapes;

/**
 * Created by Sahatov Batyr on 25.03.2019.
 */

import java.awt.*;

public class Circle extends BaseShape {
    private static final long serialVersionUID = -8905692076293496538L;
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
