package com.patterns.chainOfResponsibility.logger.objects;

/**
 * Created by Sahatov Batyr on 30.03.2019.
 */
public class SMSLogger extends Logger {

    public SMSLogger( int priority){
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("WARNING: ( SMS send) "+message);
    }
}
