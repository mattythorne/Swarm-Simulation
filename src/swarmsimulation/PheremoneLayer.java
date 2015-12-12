package swarmsimulation;

public class PheremoneLayer extends Layer {

	private int decayRate = 1;
	
	PheremoneLayer(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void decay(){
		int x;
		int y;
		for(x=0;x < super.map.length;x++){
			for(y=0;y < super.map[0].length;y++){
				if (super.map[x][y]>0) super.map[x][y] = super.map[x][y]-decayRate;
				
			}
		}		
	}
	
}
