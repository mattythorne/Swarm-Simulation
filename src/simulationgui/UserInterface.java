package simulationgui;


import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import swarmsimulation.Engine;


public class UserInterface {

	private JFrame mainFrame;
	private SimulationPanel simulationPanel1;
	private SimulationPanel simulationPanel2;
	
	private Engine simulationEngine;
	
	public UserInterface(int simulationWidth, int simulationHeight) {
		prepareGUI(simulationWidth, simulationHeight);
	}
	
	public void show(){
		mainFrame.setVisible(true);
		
		
		
		
		
		simulationPanel1.drawSimulationLayer(simulationEngine.getPhysicalMap());
		simulationPanel1.addTitle("Physical Map");
		
		simulationPanel2.drawSimulationLayer(simulationEngine.getPheremoneMap());
		simulationPanel2.addTitle("Pheremone Map");
		 
	}
	
	public void setSimulationEngine(Engine simulationEngine) {
		this.simulationEngine = simulationEngine;
	}

	private void prepareGUI(int simulationWidth, int simulationHeight){
	      mainFrame = new JFrame("Simulation");
	      mainFrame.setSize(simulationWidth*2,simulationHeight);
	      mainFrame.setLayout(new GridLayout(0, 2));
	      
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      
	      simulationPanel1 = new SimulationPanel(simulationWidth, simulationHeight);
	      simulationPanel2 = new SimulationPanel(simulationWidth, simulationHeight);
	     
	      
	      mainFrame.add(simulationPanel1);
	      mainFrame.add(simulationPanel2);
	      
	     
	}
	

}
