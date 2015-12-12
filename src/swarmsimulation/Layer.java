package swarmsimulation;

public class Layer {
	
	protected int[][] map;
	
	Layer(int width, int height){
		map = new int[width][height];
		emptyMap();
	}
	
	public Vacinity getVacinity(int x, int y){
		Vacinity vacinity = new Vacinity();
		vacinity.c = map[x][y];
		vacinity.n = map[x][y-1];
		vacinity.ne = map[x+1][y-1];
		vacinity.e = map[x+1][y];
		vacinity.se = map[x+1][y+1];
		vacinity.s = map[x][y+1];
		vacinity.sw = map[x-1][y+1];
		vacinity.w = map[x-1][y];
		vacinity.nw = map[x-1][y-1];
		return vacinity;
	}
	
	private void emptyMap(){
		int x;
		int y;
		for(x=0;x < map.length;x++){
			for(y=0;y < map[0].length;y++){
				map[x][y] = 1;
			}
		}					
	}
	
	public int[][] getMap(){
		return map;
	}
}
