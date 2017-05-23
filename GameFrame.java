package flappy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GameFrame extends JFrame{

	private GamePanel gamePanel;
	public JDialog gameOver = new JDialog(); 
	private JTextField textGameOver = new JTextField("Verloren du Assi");
	private JTextField score = new JTextField("SCORE: ");
	
	
	public GameFrame(GamePanel panel) {
		this.setGamePanel(panel);
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				getGamePanel().flyBird();
				
			}
		});
		
		add(getGamePanel());
		
		gamePanel.setLayout(new BorderLayout());
		
		gameOver.setLayout(new FlowLayout());
		gameOver.add(textGameOver);
		gameOver.setSize(200,100);
		gameOver.setVisible(true);
		
	    score.setBackground(new Color(0,191,255));
	    score.setBorder(null);	    
	    add(score, BorderLayout.NORTH);
			
		setSize (Values.SCREEN_SIZE_WIDTH, Values.SCREEN_SIZE_HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}


	public GamePanel getGamePanel() {
		return gamePanel;
	}


	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
}
