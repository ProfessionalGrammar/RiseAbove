package utilities;

import controllers.*;
import models.*;
import views.scenes.*;
import java.awt.event.*;
import javax.swing.*;

public class InputHandler implements KeyListener, ActionListener {
  private GameState state;
  private GameManager gm;
  public boolean upPressed, downPressed, leftPressed, rightPressed, interact;

  public InputHandler(GameState curState, GameManager manager) {
    state = curState;
    gm = manager;
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();

    if (state.is2D()) {
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

  @Override
  public void keyReleased(KeyEvent e) {
    int code = e.getKeyCode();

    if (state.is2D()) {
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
  
  public void actionPerformed(ActionEvent e){
      String cmd = e.getActionCommand();
      
      if(state.getLevel() == 0){
         switch(cmd){
         case "Exit": state.setGameOver(true); break;
         case "Play": gm.changeScene(new LevelSelect()); break;
         case "Instructions": gm.changeScene(new Instructions()); break;
         case "Highscore": gm.changeScene(new Highscore()); break;
         case "Credits": gm.changeScene(new Credits()); break;
         case "Back": gm.changeScene(new MainMenu()); break;
         case "Level1": state.setLevel(1); 
         case "Level2": state.setLevel(2); 
         case "Level3": state.setLevel(3); 
         }
      }
  }
}
