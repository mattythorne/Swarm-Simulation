package swarmsimulation;

import java.util.HashSet;

public class Engine {
	
	private Layer physical;
	private PheremoneLayer pheremone;
	private HashSet<IInsect> swarm;
	
	
	public Engine(int width, int height){
		physical = new Layer(width,height);
		pheremone = new PheremoneLayer(width,height);
		
	}
	
	public int[][] getPhysicalMap(){
		return physical.getMap();
	}
	
	public int[][] getPheremoneMap(){
		return pheremone.getMap();
	}
	
	

}
