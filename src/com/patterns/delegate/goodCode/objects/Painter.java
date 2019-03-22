package com.patterns.delegate.goodCode.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class Painter {
    private Graphics graphics;

    public void setGraphics(Graphics g) {
        this.graphics = g;
    }

    public void draw(){
        graphics.draw();
    }
}