package controllers;
public class Level {
  private GameState gameState;
  private GameManager gm;
  private UI window;
  
  public Level (){
    gameState = new GameState();
    window = new UI (this);
  }
  
  public void startLevel() {
        // Perform initialization tasks
        initializeLevel();

        // Start the level loop
        while (!gameState.isLevelOver()) {
            // Process user input
            processInput();

            // Update game state
            updateGameState();

            // Render game view
            render();
        }

        // Perform cleanup tasks
        cleanUp();
    }

    /* We might want to create all this code as separate classes instead of methods*/
    private void initializeLevel() {
        // Initialize game state, load assets, set up initial game objects, etc.
      gameState.setScene(1);
    }

    private void processInput() {
        // Handle user input events such as mouse clicks, key presses, etc.
        // Check user actions and update game state accordingly
        // Handle interactive events and outcomes
    }

    private void updateGameState(GameState g) {
        // Update game state based on user input, game logic, etc.
        // Manage level and scene progression based on game state and user actions
        // Determine outcomes based on user actions and update game state accordingly    
        gameState = g;
    }

    private void render() {
        // Render the game view based on the current game state
    }

    private void cleanUp() {
        // Perform cleanup tasks such as releasing resources, saving game state, etc.
    }
}
