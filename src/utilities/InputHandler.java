package utilities;

import controllers.*;
import models.*;
import views.scenes.*;
import views.scenes.lv1.*;
import views.scenes.lv2.*;
import views.scenes.lv3.*;
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

  public void keyTyped(KeyEvent e) {

  }

  public void keyPressed(KeyEvent e) {
    int code = e.getKeyCode();
    
    gm.getNextScene();
    
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
         case "Level1": state.setLevel(1); gm.changeScene(new l1scene1()); break;
         case "Level2": state.setLevel(2); gm.changeScene(new l2scene1()); break;
         case "Level3": state.setLevel(3); gm.changeScene(new l3scene1()); break;
         }
      }
      
      if(state.getLevel() == 1){
         switch(cmd){
         case "NextDialogue": gm.nextText(); break;
         }
      }   
   }
}
