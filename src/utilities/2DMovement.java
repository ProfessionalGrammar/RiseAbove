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
  
  int FPS = 60;
  
  InputHandler handler = new InputHandler();
  Thread gameThread;
  GameState state;
  Player player = new Player(this, handler);
  
  int playerX = 100;
  int playerY = 100;
  int playerSpeed = 4;
  
  public 2DMovement (GameState curState){
    state = curState;
    state.set2D(true);
    this.setPreferredSize(new Dimension(screenWidth, screenHeight));
    this.setBackground();
    this.setDoubleBuffered(true);
    this.addEventListener(handler);
    this.setFocusable(true);
    
  }
  
  public void startGameThread (){
    gameThread = new Thread(this);
    gameThread.start();
  }
  
  public void run() {
    double drawInterval = 1000000000/FPS;
    double delta = 0;
    long lastTime = System.nanoTime();
    long currentTime;
    
    while(gameThread != null){
      currentTime = System.nanoTime();
      
      delta += (currentTime - lastTime) / drawInterval;
      
      lastTime = currentTime;
      
      if(delta >= 1){
        update(); //Update info about character's position
        repaint(); //Repaint the screen
        delta--;
      }
    }
  }
  
  public void update(){
    if(handler.upPressed = true){
      Player.setY(Player.getY() + Player.getSpeed());
    }
    
    if(handler.downPressed = true){
      Player.setY(Player.getY() - Player.getSpeed());
    }
    
    if(handler.rightPressed = true){
      Player.setX(Player.getX() + Player.getSpeed());
    }
    
    if(handler.leftPressed = true){
      Player.setX(Player.getX() - Player.getSpeed());
    }
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    player.draw(g2);
    g2.dispose();
  }
  
}
