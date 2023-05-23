import javax.swing.*;
public class UI {
  GameManager gm;
  JFrame window;
  
  public UI(GameManager g){
    gm = g;
    createWindow();
  }
  
  public void createWindow (){
    window = new JFrame ();
    window.setSize();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);
  }
}
