package flappy;

import java.awt.Rectangle;
import java.util.Random;

public class Pipes {

	private Rectangle upper;
	private Rectangle lower;	
	private int gap = 100;
	int x = 600; 
		
	public Pipes() {
		
		gap = Values.GAP_Y;
		Random zufall = new Random(); 
		
		this.upper = new Rectangle (x,
				0,
				Values.PIPE_WIDTH,
				zufall.nextInt(Values.SCREEN_SIZE_HEIGHT-Values.GRASS_HEIGHT));
			
		this.lower = new Rectangle (x,
				upper.height + gap,
				Values.PIPE_WIDTH,
				Values.SCREEN_SIZE_HEIGHT-Values.GRASS_HEIGHT-upper.height-gap);		
							
	}
	
	public Rectangle getUpper() {
		return upper;
	}
	
	public Rectangle getLower() {
		return lower;
	}
}
