
public class Button extends JButton {

  public Button (int x, int y, int width, int height, String fileName, String command, InputHandler handler){
    ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResources(fileName));
    
    this = new JButton();
    this.setBounds(x, y, width, height);
    this.setBackground(null);
    this.addEventListener(handler);
    this.setActionCommand(command);
    
  }
}
