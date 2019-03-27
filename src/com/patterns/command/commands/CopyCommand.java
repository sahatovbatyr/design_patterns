package com.patterns.command.commands;

import com.patterns.command.editor.Editor;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
