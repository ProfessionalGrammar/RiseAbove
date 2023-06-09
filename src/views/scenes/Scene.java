package views.scenes;

import utilities.*;
import javax.swing.*;

public abstract class Scene {
   public JFrame frame;
   public String[] dialogue;
   public TextBox dialogueBox;
   public int dialogueCounter;
   
   public abstract void display(InputHandler handler);
   
   public void endScene(){
      frame.dispose();
   }
   
   public void setText(){
      dialogueCounter++;
   }
   
}