package com.patterns.observer.objects;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class B implements Observer{

    @Override
    public void update(Observable obs, Object arg) {

       int amount = ((Product)obs).getAmount();
        System.out.println("obj B amount="+amount);


    }
}
