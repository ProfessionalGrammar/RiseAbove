package views.scenes;

import javax.swing.*;
import utilities.*; 
import utilities.Minigame.*; 



public abstract class Scene extends JPanel {
 private JLayeredPane pane = new JLayeredPane();
 private JTextArea dialogue;
 
 public Scene (){
  this.add(pane);
 }
 
 public void addBackground(JPanel panel){
   pane.add(panel, Integer.valueOf(0));
 }
 
 public void addTextBox(TextBox box){
  dialogue = box;  
  pane.add(box, Integer.valueOf(1));
 }
 
 public void addButton(Button button){
   pane.add(button, Integer.valueOf(2));
 }
 
 public void addMinigame(Minigame minigame){
   pane.add(minigame, Integer.valueOf(3));
 }
 
 public abstract void display();
 
}
