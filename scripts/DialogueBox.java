public class DialogueBox {
  String message;
  int x = 0;
  int y;
  int width;
  int height;
  
  public DialogueBox(String msg, UI ui){
    y = ui.window.getHeight() - (ui.window.getHeight() / 5);
    width = ui.window.getWidth();
    height = ui.window.getHeight() / 5;
  }
  
  public void draw(Graphics g){
    g.setColor(color.black);
    g.drawRect(x + 5, y + 5, width - 10, height -10, 25, 25);
    g.fillRect(x, y, width, height);
    g.drawString()
  }
}
