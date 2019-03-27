package com.patterns.memento2.history;

import com.patterns.memento2.editor.Editor;

/**
 * Created by Sahatov Batyr on 25.03.2019.
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
