
public class UI {
  GameManager gm;
  JFrame window;
  
  public UI(GameManager g){
    gm = g;
  }
  
  public void createWindow (){
    window = new JFrame ();
    window.setSize();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);
  }
}
