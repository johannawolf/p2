package flappy;

import java.awt.Rectangle;
import java.util.ArrayList;

public class PipeManager {

	private ArrayList<Rectangle> list;
	private Pipes newPipes;

	
	public PipeManager() {		
		list = new ArrayList<>();	
		newPipes = new Pipes();
		list.add(newPipes.getUpper());
		list.add(newPipes.getLower());
		}
	
	public void pipeMethod(){
		movePipes();
		addPipes();
		removePipe();		
	}
	
	public void addPipes() { //neues Pipe-Paar erzeugen
		
		if( list.get(list.size()-1).x    <= Values.SCREEN_SIZE_WIDTH-Values.GAP_X ){
			newPipes = new Pipes();
			list.add(newPipes.getUpper());
			list.add(newPipes.getLower());			
		}
	}
	
	public ArrayList<Rectangle> getPipes() {	//übergibt die Liste der aktuellen Pipes als Arraylist
		return list ;
	}

	public void movePipes(){
		for(int j = 0; j< list.size();j++){
			list.get(j).x--;
		}
	}
	
	public void removePipe() { //aus Arraylist löschen
		for(int j = 0; j< list.size();j++){
			if (list.get(j).x <=-80 ){
				list.remove( list.get(0));
				list.remove( list.get(0));
			}
		}	
	}
}