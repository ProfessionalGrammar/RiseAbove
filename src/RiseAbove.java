
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class RiseAbove {   

   public RiseAbove() {
   
   }

   public static void main(String[] args) {
      
      boolean gameRun = true;
      
      SwingUtilities.invokeLater(() -> new SplashScreen()); // splash screen and game title page call
      while (gameRun) {         
         if (SplashScreen.splashScreenExit) {
         
            System.out.println(SplashScreen.splashScreenExit);
         
            new MainMenu();
            SplashScreen.splashScreenExit = false;
         
         }
      }
     
             
   }
}
