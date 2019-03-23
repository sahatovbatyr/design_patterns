package com.patterns.factory.objects;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class CarFactory {

    public Car create( String typeOfCar) {

        switch (typeOfCar){

            case "Toyota": return new Toyota();
            case "Lexus": return new Lexus();
            case "Audi": return new Audi();
            default: return null;
        }

    }


}
