

import simulationgui.UserInterface;
import swarmsimulation.Engine;


public class Main {

	private static Engine simulationEngine;
	private static UserInterface gui;
	private static int simulationWidth;
	private static int simulationHeight;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simulationWidth = 200;
		simulationHeight = 200;
		
		simulationEngine = new Engine(simulationWidth, simulationHeight);
		gui = new UserInterface(simulationWidth, simulationHeight);
		gui.setSimulationEngine(simulationEngine);
	    gui.show();
	}
	
	

}
