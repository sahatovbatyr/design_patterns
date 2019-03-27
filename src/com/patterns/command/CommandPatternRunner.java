package com.patterns.command;

import com.patterns.command.editor.Editor;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */

public class CommandPatternRunner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}