
public class GameState {
    private static int score;
    private static boolean isGameOver;
    private static boolean is2D;
    
    public GameState() {
        score = 0;
        isGameOver = false;
        is2D = false;
    }

    public static int getScore() {
        return score;
    }

    public static void increaseScore(int points) {
        score += points;
    }

    public static boolean isGameOver() {
        return isGameOver;
    }

    public static void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
    
    public static boolean is2D() {
        return is2D;
    }
    
    public static void set2D(boolean 2D) {
        is2D = 2D;
    }
    
    public static void updateState(GameState curState){
        this = curState;
    }
}
