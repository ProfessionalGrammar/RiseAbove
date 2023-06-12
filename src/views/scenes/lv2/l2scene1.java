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
   
   frame = new JFrame ("Rise Above Mental Health Simulator: Minigame");
      frame.setSize(1400,800);
      
      dialogue = new String[] {"How have you been doing?", "Good to hear that.", "I love pizza.", "That's a good idea!", "Trying to get better!"};
      dialogueBox = new TextBox(dialogue[0], 50, 600, 1300, 200);
      dialogueCounter++;
      
      JLayeredPane layeredPane = new JLayeredPane();
      draw.setBounds(0, 0, 1400, 800);  
      layeredPane.add(draw, Integer.valueOf(-1));
      
      layeredPane.add(dialogueBox, Integer.valueOf(1));
        
        JPanel buttonPanel = new JPanel(); // JPanel to hold buttons
        buttonPanel.setOpaque(false);
        buttonPanel.setBounds(1250, 600, 100, 100);
        GameButton nextButton = new GameButton("Next", "NextDialogue", 1250, 600, 100, 100, handler);
        nextButton.setOpaque(true);
        buttonPanel.add(nextButton);
        layeredPane.add(buttonPanel, Integer.valueOf(2));
        
        frame.add(layeredPane);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public Scene getNextScene(){
      return null;
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

