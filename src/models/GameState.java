
public class GameState {
    private int score;
    private boolean isGameOver;
    private boolean is2D;
    
    public GameState() {
        score = 0;
        isGameOver = false;
        is2D = false;
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
    
    public boolean is2D() {
        return is2D;
    }
    
    public void set2D(boolean 2D) {
        is2D = 2D;
    }
}
