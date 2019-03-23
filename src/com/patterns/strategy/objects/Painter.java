package com.patterns.strategy.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class Painter {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        shape.draw();
    }
}