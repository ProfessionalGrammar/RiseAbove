
public abstract class Scene extends JPanel {
 JTextArea dialogue;
 
 public void addDialogue(JTextArea box){
    this.add(box);
 }
 
 public void addButton(JButton button){
   this.add(button);
 }
}
