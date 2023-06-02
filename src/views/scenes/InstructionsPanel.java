class InstructionsPanel extends JPanel{

	//Image helpbkg = new ImageIcon("").getImage();
	JButton back = new JButton("Back"); 
	
	HelpPanel(){
		setFocusable(true); 
		add(back);			
		
		back.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
						depressionGame.cl.show(depressionGame.cards, "MenuPanel"); 
			}	
		  });
	}//end constructor
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		//g2d.drawImage(helpbkg, 0,0, null); 
		repaint();
	}//end paintComponent
}//end class
