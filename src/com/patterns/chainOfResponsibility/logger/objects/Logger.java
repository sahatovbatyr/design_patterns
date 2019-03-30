package com.patterns.chainOfResponsibility.logger.objects;

/**
 * Created by Sahatov Batyr on 29.03.2019.
 */
public abstract  class Logger {

    private int priority;
    private Logger nextLogger;


    public Logger( int priority){
        this.priority = priority;
    }

    public Logger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void writeMessage( String message, int loggerLevel){

        if (  priority <= loggerLevel ) {
            write(message);
            if ( nextLogger != null )  {
                nextLogger.writeMessage(message, loggerLevel);
            }
        } else {
            if ( nextLogger != null )  {
                nextLogger.writeMessage(message, loggerLevel);
            }

        }

    }

    abstract void write ( String message);
}
