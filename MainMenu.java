import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

class MenuPanel extends JPanel{

	JButton play = new JButton("");
	JButton help = new JButton("");
	JButton exit = new JButton("");
	
	//Image menubkg = new ImageIcon("").getImage();  //menu background
	
	/* Setting icons on buttons */
	ImageIcon playbtn = new ImageIcon("buttons\\play.png"); 
	ImageIcon helpbtn = new ImageIcon("buttons\\help.png");
	ImageIcon exitbtn = new ImageIcon("buttons\\exit.png");

	JPanel center = new JPanel(); 
	
	MenuPanel(){
		
		center.setLayout(new BoxLayout(center,BoxLayout.Y_AXIS)); 
		add(center); 
		
		/* setting icons on buttons */
		play.setIcon(playbtn); 
		help.setIcon(helpbtn);
		exit.setIcon(exitbtn);
		
		/* adding the buttons in the panel */
		center.add(play);
		center.add(help);
		center.add(exit);
				
		/* adding mouseListeners on buttons */
		play.addMouseListener(new Click());
		help.addMouseListener(new Click());
		exit.addMouseListener(new Click());
		
	}
	
	class Click extends MouseAdapter{ 
	
		public void mouseClicked(MouseEvent me){
			if(me.getSource()== play){
				depressionGame.cl.show(depressionGame.cards, "GamePanel"); 
			}
			if(me.getSource()== help){
				depressionGame.cl.show(depressionGame.cards, "HelpPanel"); 
			}	
			if(me.getSource()== exit){
				System.exit(0); 
			}
		}//end mouseClick
	}//end mouseAdapter
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		Graphics2D g2d = (Graphics2D)g; 
		setFocusable(true);		
		
		//g2d.drawImage(menubkg, 0,0, null); 
		repaint();
	}//end paintComponent
}//end GamePanel
