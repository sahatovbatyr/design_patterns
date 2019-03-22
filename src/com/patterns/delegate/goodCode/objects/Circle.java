package com.patterns.delegate.goodCode.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class Circle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
