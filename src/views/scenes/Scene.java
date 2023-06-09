package views.scenes;

import utilities.*;
import javax.swing.*;

public abstract class Scene {
   JFrame frame;
   
   
   public abstract void display(InputHandler handler);
   
   public void endScene(){
      frame.dispose();
   }
   
   public void setText(){
   
   }
   
}