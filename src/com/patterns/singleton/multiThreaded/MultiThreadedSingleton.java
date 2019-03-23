package com.patterns.singleton.multiThreaded;

/**
 * Created by Sahatov Batyr on 23.03.2019.
 */
public class MultiThreadedSingleton {

    private volatile static MultiThreadedSingleton instance;
    private static int index_2;

    private MultiThreadedSingleton(){
        index_2++;

    }

    public static MultiThreadedSingleton getInctance(){
        if ( instance == null) {
            synchronized ( MultiThreadedSingleton.class){
                instance = new MultiThreadedSingleton();
            }

        }
        System.out.println("multi");
        System.out.println("index_2="+index_2);
        return  instance;
    }

}
