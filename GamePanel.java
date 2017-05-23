package flappy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.lang.model.type.IntersectionType;
import javax.swing.JPanel;

public class GamePanel<E> extends JPanel{

	private int score;
	private Bird myBird = new Bird();
	private Rectangle bird = new Rectangle(Values.BIRD_X, myBird.getBird_y(),Values.BIRD_HEIGHT,Values.BIRD_HEIGHT);
	private Rectangle background = new Rectangle(0, 0, 600, 600);
	private Rectangle gras = new Rectangle(0, 550, 600, Values.GRASS_HEIGHT);
	
	private Pipes newPipes = new Pipes();
	ArrayList<Rectangle> list = new ArrayList<>();
	
	public GamePanel() {
	}	

	@Override
	protected void paintComponent(Graphics g) {
			
		super.paintComponent(g);
		
		g.setColor(new Color(0,191,255));
		g.fillRect(background.x, background.y, background.width, background.height);
		
		g.setColor(new Color(69,139,116));
		g.fillRect(gras.x, gras.y, gras.width, gras.height);
		
		g.setColor(new Color(255,215,0));
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
		
		g.setColor(new Color(131,139,139));
		for (Rectangle r : list){
			g.fillRect(r.x, r.y, r.width, r.height);
		}
		repaint();
	}
	
		
	public void setPipes(ArrayList<Rectangle> list) {
			this.list = list;
			repaint();
		}
		
		
	public void flyBird() {
		bird.y = bird.y-40;
	}
	
	public void fallBird(){
		bird.y++;
	}

	public boolean checkCollision() {
		if( bird.intersects(list.get(0)) || bird.intersects(list.get(1)) || bird.intersects(gras)){
			return true;
		}
		else
			return false;
	}
	

}