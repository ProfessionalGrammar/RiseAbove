public class DialogueBox {
  String message;
  int x = 0;
  int y;
  int width;
  int height;
  
  public DialogueBox(String msg, UI ui){
    y = ui.window.getHeight() / 5;
    width = ui.window.getWidth();
    height = ui.window.getHeight() - y;
  }
  
  public void draw(Graphics g){
    g.setColor(color.black);
    g.fillRect(x, y, width, height);
    g.drawString()
  }
}
