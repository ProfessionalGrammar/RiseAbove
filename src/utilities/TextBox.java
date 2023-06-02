import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class TextBox extends JTextArea{  
  
  public TextBox(String txt, int x, int y, int width, int height){
    this = new JTextArea(txt);
    this.setBounds(x, y, width, height);
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
