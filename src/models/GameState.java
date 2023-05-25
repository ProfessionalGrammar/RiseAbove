
public class GameState {
    private int score;
    private boolean isGameOver;
  
    public GameState() {
        score = 0;
        isGameOver = false;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        score += points;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
}
