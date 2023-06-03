
public abstract class Scene extends JLayeredPane {
 JTextArea dialogue;
 
 public void addTextBox(JTextArea box){
    this.add(box);
 }
 
 public void addButton(JButton button){
   this.add(button);
 }
}
