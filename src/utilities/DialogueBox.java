import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DialogueBox extends JPanel{
  String text;
  
  public DialogueBox(String txt){
    text = txt;
  }
  
  public void draw(Graphics g){
    g.setColor(color.black);
    g.drawRect(5, 605, 1390, 190, 25, 25);
    //g.drawRect(30, 600, 1340, 170);
    g.fillRect(0, 600, 1400, 200);
    g.drawString()
  }
}
