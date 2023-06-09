package utilities;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TextBox extends JTextArea {

  public TextBox(String txt, int x, int y, int width, int height) {
    super(txt);
    this.setBounds(x, y, width, height);
    this.setBackground(new Color(0, 0, 0, 128)); // Set translucent background
    this.setForeground(Color.WHITE);
    this.setEditable(false);
    this.setLineWrap(true);
    this.setWrapStyleWord(true);
    this.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
  }
}

