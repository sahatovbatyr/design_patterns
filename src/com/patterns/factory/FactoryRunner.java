package com.patterns.factory;

import com.patterns.factory.objects.Car;
import com.patterns.factory.objects.CarFactory;
import com.patterns.factory.objects.Toyota;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class FactoryRunner {

    public static void main(String[] args ) {
        CarFactory factory = new CarFactory();
        Car toyota =  factory.create("Toyota");
        toyota.drive();
        Car lexus =  factory.create("Lexus");
        lexus.drive();
        Car audi =  factory.create("Audi");
        audi.drive();

    }
}
