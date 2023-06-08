package models;

public Player extends GameObject {
  private int speed;
  2DMovement move;
  InputHandler handler;
  
  public Player (2DMovement mv, InputHandler ih){
      move = mv;
      handler = ih;
      setX(100);
      setY(100);
      speed = 4;
  }
  
 public int getSpeed () {
  return speed;
 }
 
 public void setSpeed (int spd) {
  speed = spd;
 }
  
 public void draw(Graphics2D g2) {
     //code to draw player
  }
}
