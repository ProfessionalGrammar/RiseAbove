package controllers;
public class GameManager {
  private GameState gameState;
  private UI window;
  private Level[] = new Level[3];
    
  public GameManager(){
    gameState = new GameState();
    window = new UI (this);
  }
  
  public void startGame() {
        // Perform initialization tasks
        initializeGame();

        // Start the game loop
        while (!gameState.isGameOver()) {
            // Process user input
            processInput();

            // Update game state
            updateGameState();

            // Render game view
            render();
        }

        // Perform cleanup tasks
        endGame();
    }

    private void initializeGame() {
        // Initialize game state, load assets, set up initial game objects, etc.
      level1 = new Level1();
      level2 = new Level2();
      
      gameState.setLevel(Level);
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
        UI.display();
    }

    private void endGame() {
        // Perform cleanup tasks such as releasing resources, saving game state, etc.
    }
}
