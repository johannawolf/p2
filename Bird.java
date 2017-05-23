package flappy;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Bird {

	private ArrayList<Rectangle> list = new ArrayList<>();
	private int score = 0;
	private int bird_y = 300;
	
	public Bird() {
		increaseScore();	
	}
	

	private void increaseScore(){
		for(int j = 0; j< list.size();j++){
			if (list.get(j).x <= Values.BIRD_X ){
				score++;
			}
		}
	}

	public int getScore() {	
		return score;
	}



	public int getBird_y() {
		return bird_y;
	}
}
