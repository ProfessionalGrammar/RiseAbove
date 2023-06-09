package utilities;

import javax.swing.JButton;

public class Button extends JButton {
  public Button(int x, int y, int width, int height, InputHandler handler, String command) {
    setBounds(x, y, width, height);
    addActionListener(handler);
    setActionCommand(command);
  }
}
