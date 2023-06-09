package utilities.Minigame;

import models.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minigame extends JPanel {
    private JPanel panel;
    private JLabel questionLabel;
    private GameButton[] optionButtons;
    private String[] options;

    public Minigame(String question, GameButton[] buttons) {
        panel = new JPanel();
        questionLabel = new JLabel(question);
        panel.add(questionLabel);
        optionButtons = buttons;
        options = opts;
        isCorrect = corr;
        state = gameState;

        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new GameButton(options[i]);
            panel.add(optionButtons[i]);
            if (!isCorrect[i]) {
                optionButtons[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(panel, "Incorrect!");
                        state.answer(false);
                    }
                });
            } else {
                optionButtons[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(panel, "Correct!");
                        state.answer(true);
                    }
                });
            }
        }

    }


    public void display() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("MiniGame");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
