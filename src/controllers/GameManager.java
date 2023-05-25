public class GameManager {
  private GameState gameState;
  private UI window;
  
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
        cleanUp();
    }

    /* We might want to create all this code as separate classes instead of methods*/
    private void initializeGame() {
        // Initialize game state, load assets, set up initial game objects, etc.
    }

    private void processInput() {
        // Handle user input events such as mouse clicks, key presses, etc.
    }

    private void updateGameState() {
        // Update game state based on user input, game logic, etc.
    }

    private void render() {
        // Render the game view based on the current game state
        gameView.render(gameState);
    }

    private void cleanUp() {
        // Perform cleanup tasks such as releasing resources, saving game state, etc.
    }
}
