import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DialogueBox extends JPanel{  
  private static JTextArea messageText;
  
  public DialogueBox(String txt){
    messageText = new JTextArea(txt);
    messageText.setBounds(75, 550, 1250, 200);
    messageText.setBackground(Colour.black);
    messageText.setForeground(colour.white);
    messageText.setEditable(false);
    messageText.setLineWrap(true);
    messageText.setWrapStyleWord(true);
    messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
    window.add(messageText);
  }
  
  public void setText(String txt){
   messageText.setText(txt); 
  }
}
