/*
Name: Yi Song Ding
Date: 2023-05-23
Description: Submission of semi-functional splash screen animation. 
*/

import java.awt.*;
import javax.swing.*;

public class SplashScreen {
   JFrame frame;
   
   public SplashScreen() {
      frame = new JFrame("Splashscreen Temp");
      frame.setSize(1400, 800);
      
      Drawing draw = new Drawing();
      frame.add(draw);
      frame.setVisible(true);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public class Drawing extends JComponent {
      private int step = 0;
      private int stepLineLast = 0;
      private int stepLine = 0;
      private Timer timer;
      private Timer timerLine;
      
      Drawing() {
         timer = new Timer(900, 
            e -> {
               step++;
               repaint(); // Trigger repaint to update the graphics
               if (step >= 4) {
                  timer.stop(); // Stop the timer after 3 steps
               }
            });
         timer.start(); // Start the timer
         
         timerLine = new Timer(5, 
            e -> {
               stepLine++;
               repaint();
               if (stepLine >= 500) {
               
                  timerLine.stop();
               }
            });
         timerLine.start();
      }
      
      public void paint(Graphics g) {
         int windowWidth = getWidth();
         int windowHeight = getHeight();
         
         Font splashScreenTitle = new Font("Roboto", Font.BOLD, 67);
         
         Color navyBlue = new Color(29, 54, 111);
         Color green1 = new Color(8, 192, 118);
         Color green2 = new Color(13, 157, 115);
         Color green3 = new Color(17, 122, 114);
         
         g.setColor(navyBlue);
         g.fillRect(0, 0, windowWidth, windowHeight);
         
         g.setFont(splashScreenTitle);
         g.setColor(Color.white);
         g.drawString("SYNTHESIS CREATIONS", 245, 441);
         
         g.setColor(green1);
         g.setFont(new Font("Times New Roman", Font.PLAIN, 35));
         g.drawString("Actualizing your wildest dreams.", 571, 483);
         
         // Draw the rectangles based on the step
         if (step >= 1) {
            g.setColor(green1);
            g.fillRect(1045, 367, 37, 137); // First leftmost rectangle
         }
         
         if (step >= 2) {
            g.setColor(green2);
            g.fillRect(1089, 367, 37, 137); // Second middle rectangle
         }
         
         if (step >= 3) {
            g.setColor(green3);
            g.fillRect(1133, 367, 37, 137); // Third rightmost rectangle
            
            stepLineLast = -1; // cues in the fade out animation
         }
         
         if (stepLineLast < stepLine){ // a recurring loop until stepLine is 1000+
            g.setColor(Color.white);
            g.fillRect(0, 0, 0+stepLine, 800);
            
            System.out.println(stepLine);
         }  
      }
   }
}
