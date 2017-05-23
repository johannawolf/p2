package flappy;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.Timer;

public class Controller {

	private GamePanel gamePanel ;
	private GameFrame gameFrame;

	private PipeManager pipeManager = new PipeManager();
	Pipes newPipes = new Pipes();
	ArrayList<Rectangle> list = new ArrayList<>();
	int i;
	Timer t;

	

	public Controller() {
		
		gamePanel = new GamePanel();
		gameFrame = new GameFrame(gamePanel);
		
		t = new Timer(10, e -> {
			gamePanel.fallBird();
			pipeManager.pipeMethod();
			gamePanel.setPipes(pipeManager.getPipes());
			checkCollision();
			
		});
		t.start();
		
		
	}

	 public void checkCollision(){
		 if (gamePanel.checkCollision()){
			 t.stop();
//			 gameFrame.gameOver();
			 
		 }
	 }
	 
//	 public void gameOver(){
//			gameFrame.add(gameOver);
//			}
	 

}
