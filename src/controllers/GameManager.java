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
  //private Level[] levels = new Level[4];
    
  public GameManager(){
    gameState = new GameState();
    handler = new InputHandler(gameState);
  }
  
  public void startGame() {
        // Perform initialization tasks
        initializeGame();
        
        // Perform cleanup tasks
        endGame();
    }

    private void initializeGame() {
      GameLoop lp = new GameLoop();
      Thread loop = new Thread(lp);
      loop.start();

      new MainMenu(handler);
      //SwingUtilities.invokeLater(() -> new SplashScreen());
      
      //levels[0] = new Level();
      //levels[1] = new Level1();
      //levels[2] = new Level2();
      //levels[3] = new Level3();
      
      //gameState.setLevel(levels[0]);
    }

    private void processInput() {
        // Handle user input events such as mouse clicks, key presses, etc.
        // Check user actions and update game state accordingly
        // Handle interactive events and outcomes
    }

    private void updateGameState() {
        // Update game state based on user input, game logic, etc.
        // Manage level and scene progression based on game state and user actions
        // Determine outcomes based on user actions and update game state accordingly
      
    }

    private void render() {
        // Render the game view based on the current game state
    }

    private void endGame() {
        // Perform cleanup tasks such as releasing resources, saving game state, etc.
    }
    
    public class GameLoop implements Runnable {

       @Override
       public void run() {        
           while (!gameState.isGameOver()) {
               
               processInput();
               updateGameState();
               render();
               
               try {
                   Thread.sleep(1000); // Pause the thread for 1 second
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }
}
