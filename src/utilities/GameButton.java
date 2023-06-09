package utilities;

import javax.swing.JButton;

public class GameButton extends JButton {
  public GameButton(String title, String command, int x, int y, int width, int height, InputHandler handler) {
    setText(title);
    setBounds(x, y, width, height);
    setBackground(null);
    setFocusPainted(false);
    setContentAreaFilled(false);
    addActionListener(handler);
    setActionCommand(command);
  }
}
