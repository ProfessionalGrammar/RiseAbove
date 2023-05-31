import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniGame extends JPanel {
    private JPanel panel;
    private JLabel questionLabel;
    private JButton optionButton1;
    private JButton optionButton2;
    public String question;
    public String option1;
    public String option2;
    public GameState state;

    public MiniGame(String question, String option1, String option2) {        
        panel = new JPanel();
        questionLabel = new JLabel(question);
        panel.add(questionLabel);

        optionButton1 = new JButton(option1);
        optionButton2 = new JButton(option2);

        panel.add(optionButton1);
        panel.add(optionButton2);

        optionButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Correct!");
            }
        });

        optionButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Incorrect!");
            }
        });
   }
   
  public void display(){
   SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MiniGame("hello", "one", "two");
            }
        });   
  }
}
