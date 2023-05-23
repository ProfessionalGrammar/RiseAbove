import javax.swing.*;
public class UI {
  GameManager gm;
  JFrame window;
  DialogueBox msgBox;
  
  public UI(GameManager g, DialogueBox box){
    gm = g;
    msgBox = box;
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
