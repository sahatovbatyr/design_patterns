package com.patterns.command.editor;

/**
 * Created by Sahatov Batyr on 26.03.2019.
 */
import com.patterns.command.commands.*;
import com.patterns.command.history.CommandHistory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory textFieldCommandHistory = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;

        textField.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
//                System.out.println("... keyPressed event ");

            }


            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("... keyTyped event ");
                executeCommand(new TypedCommand(editor));
            }


            @Override
            public void keyReleased(KeyEvent e) {
//                System.out.println("... keyReleased event ");
            }
        });

        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);

        content.add(buttons);
        frame.setSize(650, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            textFieldCommandHistory.push(command);
        }
    }

    private void undo() {
        if (textFieldCommandHistory.isEmpty()) return;

        Command command = textFieldCommandHistory.pop();
        if (command != null) {
            command.undo();
        }
    }
}