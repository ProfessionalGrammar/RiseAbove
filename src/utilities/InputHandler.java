import java.awt.*;

public class InputHandler implements EventListener { 
  GameObject[] objects;
  GameState state;
  public boolean upPressed, downPressed, leftPressed, rightPressed, interact;
  
  public InputHandler (GameObject[] curObj, GameState curState){
    objects = curObj;
    state = curState;
  }
  
  public void keyTyped (KeyEvent e){
    
  }
  
  public void keyPressed (KeyEvent e){
    int code = e.getKeyCode();
    
    if(state.is2D == true) {
      if(code == KeyEvent.VK_W){
        upPressed = true;
      }
      
      if(code == KeyEvent.VK_A){
        leftPressed = true;
      }
      
      if(code == KeyEvent.VK_S){
        downPressed = true;
      }
      
      if(code == KeyEvent.VK_D){
        rightPressed = true;
      }
    }
  }
  
  public void keyReleased (KeyEvent e){
    int code = e.getKeyCode();

    if(state.is2D == true) {
      if(code == KeyEvent.VK_W){
        upPressed = false;
      }
      
      if(code == KeyEvent.VK_A){
        leftPressed = false;
      }
      
      if(code == KeyEvent.VK_S){
        downPressed = false;
      }
      
      if(code == KeyEvent.VK_D){
        rightPressed = false;
      }
      if(code == KeyEvent.VK_E){
        interact = true;
      }
    }
  }
  
  public void mouseClicked(MouseEvent e) {
    if(state.isPointClick()){
      int x = getX();
      int y = getY();
      for(GameObject obj: objects) {
     
      }
    }
  }
  
  public void mousePressed(MouseEvent e) {
       
  }
  
  public void mouseReleased(MouseEvent e) {
       
  }
}
