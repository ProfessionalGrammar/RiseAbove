
public class GameObject {
 private int x;
 private int y;
 private int speed;
 public GameObject (int objx, int objy) {
  x = objx;
  y = objy;
  
 }
 
 public int getX () {
  return x;
 }
 
 public int getY () {
  return y;
 }
 
 public int getSpeed () {
  return speed;
 }
 
 public void setX (int curX) {
  x = curX;
 }
 
 public void setY (int curX) {
  x = curX;
 }
 
 public void setSpeed (int spd) {
  speed = spd;
 }
}
