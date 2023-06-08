package utilities;

import javax.swing.JButton;

public class Button extends JButton {

  public Button(int x, int y, int width, int height, String fileName, String command, InputHandler handler) {
    setBounds(x, y, width, height);
    setOpaque(false);
    addActionListener(handler);
    setActionCommand(command);
  }
}
