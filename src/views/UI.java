package views;

import views.scenes.*;
import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {

  public UI() {
    createWindow();
    this.setVisible(true);
  }

  public void createWindow() {
    this.setTitle("Rise Above");
    this.setSize(1400, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setLayout(null);
  }

  public void display(Scene scene) {
        this.getContentPane().removeAll();  // Remove all previous components
        this.getContentPane().add(scene);
        scene.display();
        this.revalidate();  // Revalidate the frame to reflect the changes
        this.repaint();  // Repaint the frame
  }
}
