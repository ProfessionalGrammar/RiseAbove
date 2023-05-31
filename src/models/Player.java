
public Player extends GameObject {
  2DMovement move;
  InputHandler handler;
  
  public Player (2DMovement mv, InputHandler ih){
      move = mv;
      handler = ih;
      setX(100);
      setY(100);
      setSpeed(4);
  }
  
  public void draw(Graphics2D g2) {
     //code to draw player
  }
}
