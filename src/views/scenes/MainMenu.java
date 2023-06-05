import java.awt.*;
import javax.swing.*;



public class MainMenu extends Scene{

   DrawingOfMenu draw2 = new DrawingOfMenu();

   public MainMenu () {
   
      JFrame frame = new JFrame ("Rise Above Mental Health Simulator: SplashScreen");
      frame.setSize(1400, 800);
   
      
      frame.add(draw2);
      frame.setVisible(true);         
   }
   
   public class DrawingOfMenu extends JComponent {
   
   
      public void paint (Graphics g){
      
         g.setColor(Color.white);
         g.fillRect(0,0,1400,500);
      }
   }
   

}
