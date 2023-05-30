java.awt.*;
java.swing.*;

public class 2DMovement extends JPanel implements Runnable {
  final int originalTileSize = 16; //16x16 tiles
  final int scale = 3;
  
  final int tileSize = originalTileSize * scale; //48x48 tiles
  final int maxScreenCol = 16;
  final int maxScreenRow = 12;
  final int screenWidth = tileSize * maxScreenCol;
  final int screenHeight = tileSize * maxScreenRow;
  
  InputHandler handler = new InputHandler();
  Thread gameThread;
  GameState state;
  
  public 2DMovement (GameState curState){
    state = curState;
    state.set2D(true);
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground();
    this.setDoubleBuffered(true);
    this.addEventListener(handler);
    
  }
  
  public void startGameThread (){
    gameThread = new Thread(this);
    gameThread.start();
  }
  
  public void run() {
    while(gameThread != null){
      update(); //Update info about character's position
      repaint(); //Repaint the screen
    }
  }
  
  public void update(){
    
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    g2.drawCharacter();
    g2.dispose();
  }
  
}
