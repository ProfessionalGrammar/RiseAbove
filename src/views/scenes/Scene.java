
public abstract class Scene extends JLayeredPane {
 JTextArea dialogue;
 
 public void addTextBox(TextBox box){
  dialogue = box;  
  this.add(box);
 }
 
 public void addButton(Button button){
   this.add(button);
 }
 
 public void addMinigame(Minigame minigame){
   this.add(minigame);
 }
}
