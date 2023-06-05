
public abstract class Scene extends JPanel {
 private JLayeredPane pane = new JLayeredPane();
 private JTextArea dialogue;
 
 public Scene (){
  this.add(pane);
 }
 
 
 public void addTextBox(TextBox box){
  dialogue = box;  
  pane.add(box, new Integer(0));
 }
 
 public void addButton(Button button){
   this.add(button, new Integer(1));
 }
 
 public void addMinigame(Minigame minigame){
   this.add(minigame, new Integer(2));
 }
}
