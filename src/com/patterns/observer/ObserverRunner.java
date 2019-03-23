package com.patterns.observer;

import com.patterns.observer.objects.A;
import com.patterns.observer.objects.B;
import com.patterns.observer.objects.Product;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class ObserverRunner {

    public static void main(String[] args ){

        Product product = new Product("pencil");
        A a = new A();
        B b = new B();

        product.addObserver(a);
        product.addObserver(b);

        for(int i=0; i<10; i++){
            product.amountPlus();
            product.notifyObservers();
        }

    }
}
