package com.patterns.singleton.singleThreaded;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class SingleThreadedSingleton {

    private static SingleThreadedSingleton instance;
    private static int index_1;

    private SingleThreadedSingleton(){
        index_1++;

    }

    public static SingleThreadedSingleton getInctance(){
        if ( instance == null) instance = new SingleThreadedSingleton();
        System.out.println("single");
        System.out.println("index_1="+index_1);
        return  instance;
    }


}
