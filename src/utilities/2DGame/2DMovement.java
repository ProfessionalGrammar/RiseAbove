java.awt.*;
java.swing.*;

public class 2DMovement implements Runnable { 
  
  int FPS = 60;
  
  InputHandler handler = new InputHandler();
  Thread gameThread;
  GameState state;
  JPanel panel;
  Player player = new Player(this, handler);
  
  public 2DMovement (GameState curState, JPanel pnl){
    state = curState;
    state.set2D(true);
    panel = pnl;
    panel.setPreferredSize(new Dimension(screenWidth, screenHeight));
    panel.setBackground();
    panel.setDoubleBuffered(true);
    panel.addEventListener(handler);
    panel.setFocusable(true);
    
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
