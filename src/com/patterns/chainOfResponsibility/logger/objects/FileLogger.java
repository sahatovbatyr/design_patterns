package com.patterns.chainOfResponsibility.logger.objects;

/**
 * Created by Sahatov Batyr on 30.03.2019.
 */
public class FileLogger extends Logger {

    public  FileLogger( int priority ){
        super(priority);
    }

    @Override
    void write(String message) {
        System.out.println("INFO: ( WRITING in FILE) "+message);
    }
}
