
import java.awt.*;
import javax.swing.*;

public class RiseAbove {
   public static JFrame frame;
   
   boolean gameRun = true;

   public DriverClass() {
      frame = new JFrame("Rise Above Mental Health Simulator");
   }

   public static void main(String[] args) {
      DriverClass defaultRun = new DriverClass();
      SwingUtilities.invokeLater(() -> new SplashScreen(frame));
      
      
      /*
      while(gameRun){
       
         new MainMenu(frame);
      
      }
      
      */
      
      
   }
}
