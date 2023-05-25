
import java.awt.*;
import javax.swing.*;

public class RiseAbove {
   public static JFrame frame;
   
   boolean gameRun = true;

   public RiseAbove() {
      frame = new JFrame("Rise Above Mental Health Simulator");
   }

   public static void main(String[] args) {
      RiseAbove defaultRun = new RiseAbove();
      SwingUtilities.invokeLater(() -> new SplashScreen(frame));
      
      
      /*
      while(gameRun){
       
         new MainMenu(frame);
      
      }
      
      */
      
      
   }
}
