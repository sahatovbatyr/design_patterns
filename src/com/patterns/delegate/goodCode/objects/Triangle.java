package com.patterns.delegate.goodCode.objects;

/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class Triangle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}
