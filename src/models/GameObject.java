
public class GameObject {
 private int x;
 private int y;
 InputHandler handler;
 
 public GameObject (int objx, int objy, InputHandler hndl) {
  x = objx;
  y = objy;
  handler = hndl;
  
 }
 
 public int getX () {
  return x;
 }
 
 public int getY () {
  return y;
 }
 
 public void setX (int curX) {
  x = curX;
 }
 
 public void setY (int curX) {
  x = curX;
 }
}
