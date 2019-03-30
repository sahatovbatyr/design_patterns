package com.patterns.chainOfResponsibility.logger;

import com.patterns.chainOfResponsibility.logger.objects.*;

/**
 * Created by Sahatov Batyr on 30.03.2019.
 */
public class LoggerRunner {

    public static void main( String[] args){

        Logger logger0 = new FileLogger(LoggerLevel.INFO);
        Logger logger1 = new SMSLogger(LoggerLevel.WARNING);
        Logger logger2 = new EmailLogger(LoggerLevel.ERROR);

        logger0.setNextLogger(logger1);
        logger1.setNextLogger(logger2);


        int a = 1;
        int b = 100;

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        random_number1 = random_number1%3;

        if (random_number1 == 0 ) {
            System.out.println("**************LOGGER IN INFO**********************");
            logger0.writeMessage("USER login in system...", LoggerLevel.INFO);

        } else if ( random_number1 == 1) {
            System.out.println("**************LOGGER IN WARNING**********************");
            logger0.writeMessage("Somebody trying drop DATABASE ...", LoggerLevel.WARNING);

        } else {
            System.out.println("**************LOGGER IN ERROR**********************");
            logger0.writeMessage("System Server ERROR: ...", LoggerLevel.ERROR);

        }


    }
}
