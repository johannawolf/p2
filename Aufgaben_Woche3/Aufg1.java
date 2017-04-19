package exercise_no3;
//Nikita Fabrizius 2257656

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class ImplementPics extends JFrame {
	
	//Member
	//FakePanels
	private JPanel north = new JPanel();
	private JPanel east = new JPanel();
	private JPanel west = new JPanel();
	
	//initialize icons
	private ImageIcon figure = new ImageIcon("C://Users/Nikiita/programs/P2/src/exercise_no3/figure.png");	
	private JLabel forPic = new JLabel(figure);
	private JPanel forOptions = new JPanel();
	private ImageIcon img3 = new ImageIcon("C://Users/Nikiita/programs/P2/src/exercise_no3/images3.jpg");
	private JButton magicPic = new JButton(img3);
	private ImageIcon img4 = new ImageIcon("C://Users/Nikiita/programs/P2/src/exercise_no3/images4.jpg");
	private JButton strengthPic = new JButton(img4);
	
	//initialize options
	private JButton save = new JButton("Save");
	private JLabel magic = new JLabel("Magic");
	private JLabel showMagicPoints = new JLabel();
	private JLabel showStrengthPoints = new JLabel();
	private JLabel strength = new JLabel("Strength");
	private JDialog setMagicPoints = new JDialog();
	private JDialog setStrengthPoints = new JDialog();
	private JButton increaseM = new JButton("increase");
	private JButton increaseS = new JButton("increase");
	private int strengthPoints;
	private int magicPoints;
	
	
	//Konstruktor 
	public ImplementPics(String title) {
		super(title);
		
		increaseMagicPoints();
		increaseStrengthPoints();
		
		//pseudoPanels..
		add(north, BorderLayout.NORTH);
		north.setSize(100,100);
		north.setBackground(Color.orange);
		
		add(east, BorderLayout.EAST);
		east.setSize(100,100);
		east.setBackground(Color.orange);
		
		add(west, BorderLayout.WEST);
		west.setSize(100,100);
		west.setBackground(Color.orange);
		
		//implement Pics and Buttons
		add(forPic, BorderLayout.CENTER);
		forPic.setSize(150,150);
		
		add(forOptions, BorderLayout.SOUTH);
		forOptions.setLayout(new FlowLayout());
		forOptions.add(magic);
		forOptions.add(magicPic);
		forOptions.add(strengthPic);
		forOptions.add(strength);
		forOptions.add(save);
		forOptions.setBackground(Color.orange);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,700);
		
	}
	
	//functions for JDialog
	public void increaseMagic() {
		increaseM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				magicPoints+=1;
				showMagicPoints.setVisible(true);
				showMagicPoints.setText(String.valueOf(magicPoints));
			}	
		});
	}
	
	public void increaseStrength() {
		increaseS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				strengthPoints+=1;
				showStrengthPoints.setVisible(true);
				showStrengthPoints.setText(String.valueOf(strengthPoints));
			}
		});
		
	}
	
	public void increaseMagicPoints() {
		magicPic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setMagicPoints.setSize(200,200);
				setMagicPoints.setVisible(true);
				setMagicPoints.setLayout(new FlowLayout());
				setMagicPoints.add(magic);
				setMagicPoints.add(showMagicPoints);
				setMagicPoints.add(increaseM);
			}
		});
		increaseMagic();
	}
	public void increaseStrengthPoints() {
		strengthPic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
						
				setStrengthPoints.setSize(200,200);
				setStrengthPoints.setVisible(true);
				setStrengthPoints.setLayout(new FlowLayout());
				setStrengthPoints.add(strength);
				setStrengthPoints.add(showStrengthPoints);
				setStrengthPoints.add(increaseS);
			}
		});
		increaseStrength();
	}
	
	//Main
	public static void main(String[] args) {
		
		ImplementPics window = new ImplementPics("DamDamDam");
	}

}
