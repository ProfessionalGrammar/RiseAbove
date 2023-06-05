package views;
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame{
  private static GameManager gm;
  private static JPanel curScene;
  
  public UI(GameManager g){
    gm = g;
    createWindow();
    this.setVisible(true);
  }
  
  public static void createWindow (){
    this = new JFrame ("Rise Above");
    this.setSize(1400, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);
  }
}
