
public abstract class Scene extends JPanel {
 private JLayeredPane pane = new JLayeredPane();
 private JTextArea dialogue;
 
 public Scene (){
  this.add(pane);
 }
 
 
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
