package com.patterns.command.history;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */
import com.patterns.command.commands.Command;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}