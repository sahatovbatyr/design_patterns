package com.patterns.command.commands;

import com.patterns.command.editor.Editor;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */
public abstract class Command {

    public Editor editor;
    private String oldText;


    Command(Editor editor) {
        this.editor = editor;
    }



    void updateOldText(){
        oldText = editor.textField.getText();
    }


    public void undo() {
        editor.textField.setText( oldText );
    }

    public abstract boolean execute();
}
