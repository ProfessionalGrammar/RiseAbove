import javax.swing.*;
import java.awt.*;

public class UI {
  private static GameManager gm;
  private static JFrame window;
  private static JLayeredPane curScene;
  
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
  
  public static void add(JLayeredPane scene) {
    curScene = scene;
    window.add(scene);
  }
}
