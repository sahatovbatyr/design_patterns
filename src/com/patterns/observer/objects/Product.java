package com.patterns.observer.objects;

import java.util.Observable;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class Product extends Observable {

    private int amount;
    private String name;

    public Product(String productName){
        this.name = productName;
        amount = 0;
    }

    public void amountPlus(){
        this.amount++;
        super.setChanged();

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        boolean isNewValue = false;

        if ( this.amount != amount) {isNewValue = true;}
        this.amount = amount;
        if ( isNewValue) {super.setChanged();}

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
