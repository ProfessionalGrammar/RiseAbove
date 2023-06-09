package views.scenes.lv2;

import views.scenes.*;
import utilities.*;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class l2scene1 extends Scene{
   
   JFrame frame;
   DrawingBack draw = new DrawingBack();

   public void display (InputHandler handler) {
   frame = new JFrame ("Rise Above Mental Health Simulator: Quiz Minigame");
      frame.setSize(1400,800);

   JLayeredPane layeredPane = new JLayeredPane();
      draw.setBounds(0, 0, 1400, 800);  
      layeredPane.add(draw, Integer.valueOf(-1));

   }
   
   public class DrawingBack extends JComponent {
   
      public DrawingBack () {
      
      }
      public void paint(Graphics g){
      g.setColor(Color.WHITE);
       g.fillRect(0,0,1400,800);
       }
       }

}
