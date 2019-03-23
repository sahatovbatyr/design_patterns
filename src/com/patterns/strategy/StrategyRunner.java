package com.patterns.strategy;

import com.patterns.strategy.objects.Circle;
import com.patterns.strategy.objects.Painter;
import com.patterns.strategy.objects.Triangle;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class StrategyRunner {

    public static void main(String[] args) {

        Painter painter = new Painter();
        painter.setShape( new Circle());
        painter.draw();

        painter.setShape( new Triangle());
        painter.draw();


    }

}
