import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ToDoList extends JPanel{  
  private static JTextArea toDoBox;
  
  public DialogueBox(String tasks){
    toDoBox = new JTextArea(tasks);
    toDoBox.setBounds(1150, 30, 200, 150);
    toDoBox.setBackground(Colour.black);
    toDoBox.setForeground(colour.white);
    toDoBox.setEditable(false);
    toDoBox.setLineWrap(true);
    toDoBox.setWrapStyleWord(true);
    toDoBox.setFont(new Font("Book Antiqua", Font.PLAIN, 30));
    window.add(toDoBox);
  }
  
  public void setText(String tasks){
   messageText.setText(tasks); 
  }
}
