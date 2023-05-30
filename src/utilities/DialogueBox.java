import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DialogueBox extends JPanel{
  String text;
  
  public DialogueBox(String txt){
    text = txt;
    
    messageText = new JTextArea(text);
    messageText.setBounds(75, 550, 1250, 200);
    messageText.setBackground(Colour.black);
    messageText.setForeground(colour.white);
    messageText.setEditable(false);
    messageText.setLineWrap(true);
    messageText.setWrapStyleWord(true);
    messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
    window.add(messageText);
      
      
  }
  
  
  
 /* public void draw(Graphics g){
    g.setColor(color.black);
    g.drawRect(5, 605, 1390, 190, 25, 25);
    //g.drawRect(30, 600, 1340, 170);
    g.fillRect(0, 600, 1400, 200);
    g.drawString()
  }*/
  
}
