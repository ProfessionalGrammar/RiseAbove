import javax.swing.*;
import java.awt.*;

public class UI {
  private static GameManager gm;
  private static JFrame window;
  
  public UI(GameManager g){
    gm = g;
    createWindow();
    window.setVisible(true);
  }
  
  public static void createWindow (){
    window = new JFrame ("Rise Above");
    window.setSize(1400, 800);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setLayout(null);
  }
  
  public static void add(JPanel scene) {
    window.add(scene);
  }
}
