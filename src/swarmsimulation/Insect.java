package swarmsimulation;

public abstract class Insect {
	
	
	private Position currentPosition=null;
	
	Insect(){
		currentPosition = new Position(0,0);
	}
	
	Insect(Position startPosition){
		currentPosition = startPosition;
	}
	
	public void nextIteration(Vacinity vacinity){
		
	}
	
	public Position getPosition(){
		return currentPosition;
	}
}
