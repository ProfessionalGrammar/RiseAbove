package views.scenes;

public abstract class Scene extends JPanel {
 private JLayeredPane pane = new JLayeredPane();
 private JTextArea dialogue;
 
 public Scene (){
  this.add(pane);
 }
 
 public void addBackground(JPanel panel){
   pane.add(panel, new Integer(0));
 }
 
 public void addTextBox(TextBox box){
  dialogue = box;  
  pane.add(box, new Integer(1));
 }
 
 public void addButton(Button button){
   pane.add(button, new Integer(2));
 }
 
 public void addMinigame(Minigame minigame){
   pane.add(minigame, new Integer(3));
 }
}
