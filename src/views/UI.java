import javax.swing.*;
import java.awt.*;

public class UI extends JFrame{
  GameManager gm;
  JFrame window;
  
  public UI(GameManager g){
    gm = g;
    createWindow();
    window.setVisible(true);
  }
  
  public void createWindow (){
    window = new JFrame ("Rise Above");
    window.setSize(1400, 800);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setLayout(null);
  }
  
}
