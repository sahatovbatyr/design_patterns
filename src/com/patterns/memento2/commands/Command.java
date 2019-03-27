package com.patterns.memento2.commands;

/**
 * Created by Sahatov Batyr on 25.03.2019.
 */
public interface Command {
    String getName();
    void execute();
}
