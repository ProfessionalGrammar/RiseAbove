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

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g.create();
    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f)); // Set transparency level
    g2d.setColor(getBackground());
    g2d.fillRect(0, 0, getWidth(), getHeight());
    super.paintComponent(g2d);
    g2d.dispose();
  }

  public void setText(String txt) {
    super.setText(txt);
  }
}

