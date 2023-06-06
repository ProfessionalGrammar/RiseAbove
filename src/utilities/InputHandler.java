package utilities;
import java.awt.event.*;

public class InputHandler implements EventListener {
  private static GameObject[] objects;
  private static GameState state;
  public static boolean upPressed, downPressed, leftPressed, rightPressed, interact;
  
  public InputHandler(GameObject[] curObj, GameState curState) {
    objects = curObj;
    state = curState;
  }
  
  public static void keyTyped(KeyEvent e) {
    
  }
  
  public static void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();
    
    if (state.is2D == true) {
      if (code == KeyEvent.VK_W) {
        upPressed = true;
      }
      
      if (code == KeyEvent.VK_A) {
        leftPressed = true;
      }
      
      if (code == KeyEvent.VK_S) {
        downPressed = true;
      }
      
      if (code == KeyEvent.VK_D) {
        rightPressed = true;
      }
    }
  }
  
  public static void keyReleased(KeyEvent e) {
    int code = e.getKeyCode();

    if (state.is2D == true) {
      if (code == KeyEvent.VK_W) {
        upPressed = false;
      }
      
      if (code == KeyEvent.VK_A) {
        leftPressed = false;
      }
      
      if (code == KeyEvent.VK_S) {
        downPressed = false;
      }
      
      if (code == KeyEvent.VK_D) {
        rightPressed = false;
      }
      
      if (code == KeyEvent.VK_E) {
        interact = true;
      }
    }
  }
  
  public static void mouseClicked(MouseEvent e) {
    if (state.isPointClick()) {
      int x = e.getX();
      int y = e.getY();
      for (GameObject obj : objects) {
        // Process the click event for each game object
      }
    }
  }
  
  public static void mousePressed(MouseEvent e) {
       
  }
  
  public static void mouseReleased(MouseEvent e) {
       
  }
}
