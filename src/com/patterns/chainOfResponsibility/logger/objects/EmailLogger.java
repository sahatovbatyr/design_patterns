package com.patterns.chainOfResponsibility.logger.objects;

/**
 * Created by Sahatov Batyr on 30.03.2019.
 */
public class EmailLogger extends Logger{

    public  EmailLogger( int priority ){
        super(priority);
    }



    @Override
    void write(String message) {
        System.out.println("ERROR: (Sending EMAIL) "+message);
    }
}
