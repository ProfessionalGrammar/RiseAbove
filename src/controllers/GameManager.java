package controllers;
import models.*;
import views.*;
import views.scenes.*;
import views.scenes.lv1.*;
import utilities.*;

import javax.swing.*;
import java.util.*;

public class GameManager {
  private GameState gameState;
  private InputHandler handler;
  private Scene scene;
      
  public GameManager(){
    gameState = new GameState();
    handler = new InputHandler(gameState, this);
  }
  
  public void startGame() {
      GameLoop lp = new GameLoop();
      Thread loop = new Thread(lp);
      loop.start();
      
      scene = new l1scene2();
      scene.display(handler);
      //SwingUtilities.invokeLater(() -> new SplashScreen());
  }
  
  public void changeScene(Scene newScene){
      scene.endScene();
      newScene.display(handler);
      scene = newScene;
  }
  
  public void setText(){
   scene.setText();
  }

  private void processInput() {
        // Handle user input events such as mouse clicks, key presses, etc.
        // Check user actions and update game state accordingly
        // Handle interactive events and outcomes
  }

  private void updateGame() {
        // Update game state based on user input, game logic, etc.
        // Manage level and scene progression based on game state and user actions
        // Determine outcomes based on user actions and update game state accordingly
      
  }

  private void render() {
        // Render the game view based on the current game state
  }

  private void endGame() {
        // Perform cleanup tasks such as releasing resources, saving game state, etc.
        System.exit(0);
  }
    
  public class GameLoop implements Runnable {

     @Override
     public void run() {        
         while (!gameState.isGameOver()) {
               
             processInput();
             updateGame();
             render();
               
             try {
                 Thread.sleep(1000); // Pause the thread for 1 second
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }    
         
         endGame();    
      }
   }
}
