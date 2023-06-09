package views.scenes;

import utilities.*;
import javax.swing.*;

public abstract class Scene {
   public JFrame frame;
   public String[] dialogue;
   public TextBox dialogueBox;
   public int dialogueCounter;
   
   public abstract void display(InputHandler handler);
   public abstract Scene getNextScene();
   
   public void endScene(){
      if (frame != null) {
            frame.dispose();
        }
   }
   
   public void nextText(){
      if(dialogueCounter < dialogue.length){
         dialogueBox.setText(dialogue[dialogueCounter]);
         dialogueCounter++;
      }
   }
}