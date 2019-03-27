package com.patterns.command.commands;

import com.patterns.command.editor.Editor;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

//        backup();

        updateOldText();

        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
