package utilities.Minigame;

import models.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minigame extends JPanel {
    private JPanel panel;
    private JLabel questionLabel;
    private JButton[] optionButtons;
    private String[] options;
    private boolean[] isCorrect;
    private GameState state;

    public Minigame(String question, JButton[] buttons, String[] opts, boolean[] corr, GameState gameState) {
        panel = new JPanel();
        questionLabel = new JLabel(question);
        panel.add(questionLabel);
        optionButtons = buttons;
        options = opts;
        isCorrect = corr;
        state = gameState;

        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new JButton(options[i]);
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
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
