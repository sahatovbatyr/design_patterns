package com.patterns.singleton;

import com.patterns.singleton.multiThreaded.MultiThreadedSingleton;
import com.patterns.singleton.singleThreaded.SingleThreadedSingleton;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class SingletonRunner {

    public static void main(String[] args){

        SingleThreadedSingleton singleThreadedSingleton =  SingleThreadedSingleton.getInctance();
        singleThreadedSingleton =  SingleThreadedSingleton.getInctance();
        singleThreadedSingleton =  SingleThreadedSingleton.getInctance();

        System.out.println("*************************");

        MultiThreadedSingleton multiThreadedSingleton =  MultiThreadedSingleton.getInctance();
        multiThreadedSingleton =  MultiThreadedSingleton.getInctance();
        multiThreadedSingleton =  MultiThreadedSingleton.getInctance();




    }

}
