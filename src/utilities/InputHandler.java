package utilities;

import models.*;
import java.awt.event.*;
import javax.swing.*;

public class InputHandler implements KeyListener, ActionListener {
  private GameState state;
  public boolean upPressed, downPressed, leftPressed, rightPressed, interact;

  public InputHandler(GameState curState) {
    state = curState;
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
      
      switch(cmd){
      case "Exit": state.setGameOver(true); break;
      case "Play": state.setGameOver(true); break;
      case "Instructions": state.setGameOver(true); break;
      case "Highscore": state.setGameOver(true); break;
      case "Credits": state.setGameOver(true); break;
      }
  }
}
