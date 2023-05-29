import java.awt.*;

public class InputHandler implements EventListener { 
  GameObject[] objects;
  
  public InputHandler (GameObject[] curObj){
    objects = curObj;
  }
  
  public void keyTyped (KeyEvent e){
    
  }
  
  public void keyPressed (KeyEvent e){
    
  }
  
  public void keyReleased (KeyEvent e){
    
  }
  
  public void mouseClicked(MouseEvent e) {
    int x = getX();
    int y = getY();
    for(GameObject obj: objects) {
     
    }
  }
  
  public void mousePressed(MouseEvent e) {
       
  }
  
  public void mouseReleased(MouseEvent e) {
       
  }
}
