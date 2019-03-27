package com.patterns.command.commands;

import com.patterns.command.editor.Editor;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */
public class TypedCommand extends Command {

    public TypedCommand(Editor editor){
        super(editor);
    }

    @Override
    public boolean execute() {

        updateOldText();
        return true;

    }
}
