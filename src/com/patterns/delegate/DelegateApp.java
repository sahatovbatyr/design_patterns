package com.patterns.delegate;

import com.patterns.delegate.goodCode.objects.*;


/**
 * Created by Sahatov Batyr on 22.03.2019.
 */
public class DelegateApp {

    public static void main(String[] args){

        Painter painter = new Painter();
        painter.setGraphics( new Circle());
        painter.draw();

        painter.setGraphics( new Triangle());
        painter.draw();
    }
}








