import javax.swing.*;
import java.awt.*;

public class UI extends JFrame{
  GameManager gm;
  JFrame window;
  DialogueBox message;
  
  public UI(GameManager g, DialogueBox msg){
    gm = g;
    message = msg;
    
    public void ActionPerformed (ActionEvent e){
       InputHandler.handleInput(); 
    }
    
    createWindow();
    window.setVisible(true);
  }
  
  public void createWindow (){
    window = new JFrame ();
    window.setSize(1400, 800);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);
  }
}
