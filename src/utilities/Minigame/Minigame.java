import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniGame extends JPanel {
    private JFrame frame;
    private JPanel panel;
    private JLabel questionLabel;
    private JButton optionButton1;
    private JButton optionButton2;
    public String question;
    public String option1;
    public String option2;

    public MiniGame(String question, String option1, String option2) {
        frame = new JFrame("minigame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 800);

        setLayout(new FlowLayout());
        
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
                frame.dispose();
            }
        });

        optionButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Incorrect!");
                frame.dispose();
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MiniGame("hello", "one", "two");
            }
        });
    }
}
