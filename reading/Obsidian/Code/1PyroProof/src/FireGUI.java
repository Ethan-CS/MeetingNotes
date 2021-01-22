/**
 * A class that constructs a GUI for the Firefighting problem simulation/game.
 * 
 * @author Corinne Madsen
 * @date 5/23/15
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FireGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private Container cPane;
	private static Image graph;
	private static int side=600;
	private static int gap=side/20;
	private static int radius =side/100;
	private static JLabel label = new JLabel(" ");
	private static JPanel info= new JPanel();
	private static JLabel timeCounter = new JLabel("Time: "+FirefighterModel.getTime());
	private static JLabel turnCounter = new JLabel("Firefighter's Turn",javax.swing.SwingConstants.RIGHT);
	private static int fireMode=0; //0=User choice, 1=random choice
	private static int firefighterMode=0; //0=User choice, 1=Random D7 protection, 2=Algorithm D7 protection
	private static JPanel fireOpts, firefOpts; 
	private static Container optionBar=new Container();
	private static Container gridDisplay=new Container();
	private static ButtonGroup fireOptButtons = new ButtonGroup();
	private static ButtonGroup firefOptButtons = new ButtonGroup();
	private static JButton clear = new JButton("Reset Grid");
	private static JRadioButton fire1 = new JRadioButton("User Choice", true);
	private static JRadioButton fire2 = new JRadioButton("Random Mode", false);
	private static JRadioButton firef1 = new JRadioButton("User Choice", true);
	private static JRadioButton firef2 = new JRadioButton("Random D7 Protection", false);
	private static JRadioButton firef3 = new JRadioButton("Algorithmic D7 Protection", false);
	public static boolean goPastD7=false;

	/**
	 * This constructor creates the GUI for the Firefighting problem simulation.
	 */
	public FireGUI(){
		super("Firefighting Problem Simulation");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(900,700));
		setLocation(200, 30);
		cPane = getContentPane();
		cPane.setLayout(new BoxLayout(cPane, BoxLayout.X_AXIS));
		setUpGridDisplay();
		setUpOptionBar();
		cPane.add(optionBar);
		cPane.add(gridDisplay);
		pack();
		setVisible(true);
		new FirefighterModel();
		this.addComponentListener(new ComponentListener(){

			@Override
			public void componentHidden(ComponentEvent ce) {}

			@Override
			public void componentMoved(ComponentEvent ce) {}

			@Override
			public void componentResized(ComponentEvent ce) {
				side=Math.min(gridDisplay.getHeight()-50,gridDisplay.getWidth()-50);
				gap=side/20;
				radius =side/100;
				graph.repaint();
			}

			@Override
			public void componentShown(ComponentEvent ce) {}

		});
	}

	/**
	 * This class sets up the right side of the GUI with the Image, time label, and turn label.
	 */
	public void setUpGridDisplay(){
		gridDisplay.setLayout(new BoxLayout(gridDisplay, BoxLayout.Y_AXIS));
		gridDisplay.setPreferredSize(new Dimension(side,side+30));
		graph = new Image();
		info.setLayout(new BoxLayout(info, BoxLayout.X_AXIS));
		info.add(timeCounter);
		info.add(Box.createHorizontalGlue());
		info.add(turnCounter);
		gridDisplay.add(info);
		turnCounter.setForeground(Color.BLUE);
		gridDisplay.add(graph);
		gridDisplay.add(label);
	}


	/**
	 * This class sets up the radio buttons for the fire and firefighter options and reset button on the GUI.
	 */
	public static void setUpOptionBar(){
		optionBar.setLayout(new BoxLayout(optionBar, BoxLayout.Y_AXIS));
		optionBar.setPreferredSize(new Dimension(190, side+30));
		optionBar.add(new Box.Filler(new Dimension(100,0), new Dimension(100,30), new Dimension(100,30)));

		clear.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				reset();
			}
		});
		optionBar.add(clear);
		clear.setAlignmentX(Component.CENTER_ALIGNMENT);
		optionBar.add(new Box.Filler(new Dimension(100,0), new Dimension(100,30), new Dimension(100,30)));

		fireOpts=new JPanel(new GridLayout(2,1));
		fire1.addActionListener(new ButtonListener(0,0));
		fire2.addActionListener(new ButtonListener(0,1));
		fireOptButtons.add(fire1);
		fireOptButtons.add(fire2);
		fireOpts.add(fire1);
		fireOpts.add(fire2);
		fireOpts.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Fire Mode"));
		optionBar.add(fireOpts);
		optionBar.add(new Box.Filler(new Dimension(100,0), new Dimension(100,30), new Dimension(100,30)));

		firefOpts = new JPanel(new GridLayout(3,1));
		firef1.addActionListener(new ButtonListener(1,0));
		firef2.addActionListener(new ButtonListener(1,1));
		firef3.addActionListener(new ButtonListener(1,2));
		firefOptButtons.add(firef1);
		firefOptButtons.add(firef2);
		firefOptButtons.add(firef3);
		firefOpts.add(firef1);
		firefOpts.add(firef2);
		firefOpts.add(firef3);
		firefOpts.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Firefighter Mode"));
		optionBar.add(firefOpts);     
		Dimension extraMinSize=new Dimension(180,0);
		Dimension extraMaxSize=new Dimension(180,600);
		Dimension extraPrefSize = new Dimension(180,600);
		optionBar.add(new Box.Filler(extraMinSize, extraPrefSize, extraMaxSize));

	}


	/**
	 * This class changes all text labels to convey correctly the time and turn.
	 */
	public static void setCounters(){
		String s="'s Turn";
		if(FirefighterModel.isBurnTurn()){
			s="Fire".concat(s);
			turnCounter.setForeground(Color.RED);
		}
		else{
			s="Firefighter".concat(s);
			turnCounter.setForeground(Color.BLUE);

		}
		turnCounter.setText(s);
		timeCounter.setText("Time: "+FirefighterModel.getTime());
	}

	/**
	 * This class defines buttonlisteners for the radio buttons that can change the type of fire and firefighter.
	 *
	 */
	static class ButtonListener implements ActionListener{
		public int buttonType; //0=fire, 1=firefighter
		public int option;

		ButtonListener(int type, int opt){
			buttonType=type;
			option=opt;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(buttonType==0){
				fireMode=option;
				if(option==1 && FirefighterModel.isBurnTurn()){
					FirefighterModel.randomBurn();
					if(FirefighterModel.hasReachedD7()){
						graph.repaint();
						int choice=JOptionPane.showConfirmDialog(null,  "The fire has reached D7. Do you wish to reset the board?", 
								"Fire Reached D7", JOptionPane.YES_NO_OPTION);
						if(choice==0){
							reset();
						}
					}
					graph.repaint();
				}
			}
			else{
				firefighterMode=option;
				if(option==1 && !FirefighterModel.isBurnTurn()){
					if(FirefighterModel.randomD7Protect()){
						graph.repaint();
						JOptionPane.showMessageDialog(null,  "All D7 vertices have been protected and the fire has been contained. The board will now reset.", 
								"Fire Contained", JOptionPane.INFORMATION_MESSAGE);
						reset();
					}
					graph.repaint();
				}
				if(option==2 && !FirefighterModel.isBurnTurn()){
					if(FirefighterModel.algorithmicD7Protect()){
						graph.repaint();
						JOptionPane.showMessageDialog(null,  "All D7 vertices have been protected and the fire has been contained. The board will now reset.", 
								"Fire Contained", JOptionPane.INFORMATION_MESSAGE);
						reset();
					}
					graph.repaint();
				}
			}
			if(fireMode>0 && firefighterMode>0){
				JOptionPane.showMessageDialog(null,  "Both the fire and firefighter cannot be random. Please choose one to be controlled by the computer and one to be played as a user.", 
						"Random Warning", JOptionPane.INFORMATION_MESSAGE);
			}

		}

	}

	/**
	 * This method resets the simulation back to Time 0.
	 */
	public static void reset(){
		fire1.setSelected(true);
		fireMode=0;
		firefighterMode=0;
		goPastD7=false;
		firef1.setSelected(true);
		new FirefighterModel();
		FirefighterModel.switchBurnTurn(false);
		setCounters();
		graph.repaint();
	}

	/**
	 * This method processes a single click on the simulation by figuring which vertex is closest to the click
	 * then using that vertex to either protect or burn from depending on whether it is the fire or firefighter's turn.
	 * @param x - the x location of the click
	 * @param y - the y location of the click
	 */
	public static void click(int x, int y){
		//determine the node
		int xRound = (int)Math.round((x-side*0.5)/gap);
		int yRound = (int)Math.round((y-side*0.5)/gap);
		if(xRound<-8||xRound>8||yRound<-8||yRound>8){
			return;
		}
		Coordinate c = new Coordinate(xRound,yRound);
		Vertex v = Vertex.getVertex(c);
		if(FirefighterModel.isBurnTurn()){
			//burn from
			if(FirefighterModel.burnFrom(v)){
				FirefighterModel.switchBurnTurn(false);
				label.setText(" ");
				if(FirefighterModel.hasReachedD7()&&!goPastD7){
					graph.repaint();
					int choice=JOptionPane.showConfirmDialog(null,  "The fire has reached D7. Do you wish to reset the board?", 
							"Fire Reached D7", JOptionPane.YES_NO_OPTION);
					if(choice==0){
						reset();
					}
					else{
						goPastD7=true;
					}
				}
				if(firefighterMode==1){
					if(FirefighterModel.randomD7Protect()){
						graph.repaint();
						JOptionPane.showMessageDialog(null,  "All D7 vertices have been protected and the fire has been contained. The board will now reset.", 
								"Fire Contained", JOptionPane.INFORMATION_MESSAGE);
						reset();
					}
				}
				if(firefighterMode==2){
					if(FirefighterModel.algorithmicD7Protect()){
						graph.repaint();
						JOptionPane.showMessageDialog(null,  "All D7 vertices have been protected and the fire has been contained. The board will now reset.", 
								"Fire Contained", JOptionPane.INFORMATION_MESSAGE);
						reset();
					}
				}
			}
			else{
				label.setText("That vertex cannot be burned from this turn.");
			}
		}
		else{
			//protect at
			if(FirefighterModel.protect(v)){
				FirefighterModel.switchBurnTurn(true);
				label.setText(" ");
				if(fireMode==1){
					FirefighterModel.randomBurn();
					if(FirefighterModel.hasReachedD7()){
						graph.repaint();
						int choice=JOptionPane.showConfirmDialog(null,  "The fire has reached D7. Do you wish to reset the board?", 
								"Fire Reached D7", JOptionPane.YES_NO_OPTION);
						if(choice==0){
							reset();
						}
					}
				}
			}
			else{
				label.setText("That vertex cannot be protected this turn.");
			}
		}
		setCounters();

	}


	/**
	 * This class is that of the Image of the simulation. It listens for mouse clicks to determine
	 * where to burn from or protect and draws the current state of the simulation.
	 *
	 */
	public class Image extends JPanel {
		private static final long serialVersionUID = 1L;
		public Image() {
			super();
			setBackground(Color.WHITE);
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					FireGUI.click(e.getX(),e.getY());
					repaint();
				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}
			});
		}

		/**
		 * Return the preferred size of the simulation Image
		 */
		public Dimension getPreferredSize() {
			Dimension d = new Dimension(side, side);
			return d;
		}

		/**
		 * This method draws the simulation Image by drawing the grid and points then marking
		 * burnt and protected vertices.
		 */
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.gray);
			//Drawing the vertical lines
			for(int i=0; i<19; i++){g2.drawLine(gap*(i+1), 0, gap*(i+1), side);}
			//Drawing the horizontal lines
			for(int i=0; i<19; i++){g2.drawLine(0, gap*(i+1), side, gap*(i+1));}
			//Drawing the diagonal lines for d5
			Polygon diamond5 = new Polygon();
			diamond5.addPoint(gap+9*gap, gap+4*gap);
			diamond5.addPoint(gap+4*gap, gap+9*gap);
			diamond5.addPoint(gap+9*gap, gap+14*gap);
			diamond5.addPoint(gap+14*gap, gap+9*gap);
			g2.drawPolygon(diamond5);
			//Drawing the diagonal lines for d7
			Polygon diamond7 = new Polygon();
			diamond7.addPoint(gap+9*gap, gap+2*gap);
			diamond7.addPoint(gap+2*gap, gap+9*gap);
			diamond7.addPoint(gap+9*gap, gap+16*gap);
			diamond7.addPoint(gap+16*gap, gap+9*gap);
			g2.drawPolygon(diamond7);

			//Drawing the burned/protected vertices
			Vertex[][] grid=FirefighterModel.getGrid();
			for(int i=0; i<grid.length; i++){
				for(int j=0; j<grid[i].length; j++){
					if(grid[i][j].isBurned()){
						g2.setColor(Color.RED);
						g2.fillOval(gap+i*gap-radius, gap+j*gap-radius, radius*2, radius*2);
						//encircling the recently burned vertices
						if(FirefighterModel.getJustBurned().contains(grid[i][j].getCoordinate())){
							g2.drawOval(gap+i*gap-radius*3/2, gap+j*gap-radius*3/2, (radius*3/2)*2, (radius*3/2)*2);
						}
						g2.drawLine(gap+i*gap, gap+j*gap, gap+(grid[i][j].getBurnOrigin().getX()+9)*gap, gap+(grid[i][j].getBurnOrigin().getY()+9)*gap);

					}
					else if(grid[i][j].isProtected()){
						g2.setColor(Color.BLUE);
						g2.setStroke(new BasicStroke(2));
						g2.drawOval(gap+i*gap-radius, gap+j*gap-radius, radius*2, radius*2);
						g2.setStroke(new BasicStroke(1));
					}
					else{
						g2.setColor(Color.lightGray);
						g2.fillOval(gap+i*gap-radius,gap+j*gap-radius, radius*2, radius*2);
					}
				}
			}
		}
	}


	/**
	 * Main method for the Firefighting Problem simulation that runs the GUI
	 */
	public static void main(String[] args) {
		new FireGUI();
		while(true){
			if(FirefighterModel.getBurnableVertices().isEmpty()){
				JOptionPane.showMessageDialog(null,  "The fire can no longer expand. The graph will be reset.", 
						"Fire Contained", JOptionPane.INFORMATION_MESSAGE);
				reset();

			}
		}

	}

}
