package utilities.minigame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniGame extends JPanel {
    private JPanel panel;
    public String question;
    private JLabel questionLabel;
    private JButton[] optionButtons;
    public String[] options;
    public boolean[] isCorrect;
    public GameState state;

    public MiniGame(String question, JButton[] buttons, String[] opts, boolean[] corr) {        
        panel = new JPanel();
        questionLabel = new JLabel(question);
        panel.add(questionLabel);
        optionButtons = buttons;
        options = opts;
        isCorrect = corr;
        
        for(int i = 0; i < optionButtons.length; i++){
            optionButtons[i] = new JButton(options[i])
            panel.add(optionButtons[i]);
            if(isCorrect[i] = false) {
                optionButton[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(panel, "Incorrect!");
                        state.answer(false);
                    }
                });
            else{
                optionButton[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(panel, "Correct!");
                        state.answer(true);
                    }
                });
            }
        }
        
   }
   
   
  public void display(){
   SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MiniGame("hello", "one", "two");
            }
        });   
  }
}
