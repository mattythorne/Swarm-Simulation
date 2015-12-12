package simulationgui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


import javax.swing.JPanel;

public class SimulationPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage canvas;
    

    public SimulationPanel(int width, int height) {
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        fillCanvas(Color.LIGHT_GRAY);
        
    }

    public Dimension getPreferredSize() {
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }


    public void fillCanvas(Color c) {
        int color = c.getRGB();
        for (int x = 0; x < canvas.getWidth(); x++) {
            for (int y = 0; y < canvas.getHeight(); y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }


    public void putPixel(Color c, int x, int y) {
    	canvas.setRGB(x, y, c.getRGB());
        repaint();
    }
    
    public void addTitle(String title){
    	Graphics graphics = canvas.getGraphics();
    	graphics.setColor(Color.WHITE);
        graphics.drawString(title, 2, 12);
    	repaint();
    }
    
    public void addTitle(String title, Font font){
    	Graphics graphics = canvas.getGraphics();
    	graphics.setColor(Color.WHITE);
        graphics.setFont(font);
        graphics.drawString(title, 2, 12);
    	repaint();
    }

    public void drawSimulationLayer(int[][] map){
    	int x;
		int y;
		Color c = null;
		for(x=0;x < map.length;x++){
			for(y=0;y < map[0].length;y++){
				int r=(map[x][y] & 0xff0000) >> 16;
				int g=(map[x][y] & 0x00ff00) >> 8;
				int b=(map[x][y] & 0x0000ff);
				c=new Color(r,g,b);
				putPixel(c, x, y);
			}
		}
		repaint();
    }
   
    
}
