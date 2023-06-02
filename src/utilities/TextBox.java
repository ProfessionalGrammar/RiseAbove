import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TextBox extends JTextArea{  
  
  public TextBox(String txt){
    this = new JTextArea(txt);
    this.setBounds(75, 550, 1250, 200);
    this.setBackground(Colour.black);
    this.setForeground(colour.white);
    this.setEditable(false);
    this.setLineWrap(true);
    this.setWrapStyleWord(true);
    this.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
  }
  
  public void setText(String txt){
   this.setText(txt); 
  }
}
