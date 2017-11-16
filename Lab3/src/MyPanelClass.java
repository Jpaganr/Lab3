import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                        
                        //Draw a second border
                        g.setColor(Color.RED);
                        g.fillRect(x1+10,y1+10,210,28);
                        
                      //Draw a second border
                        g.setColor(Color.WHITE);
                        g.fillRect(x1+10,y1+38,210,56);
                        
                      //Draw a second border
                        g.setColor(Color.RED);
                        g.fillRect(x1+10,y1+65,210,28);
                        
                      //Draw a second border
                       g.setColor(Color.WHITE);
                       g.fillRect(x1+10,y1+93,210,28);
                        
                      //Draw a second border
                        g.setColor(Color.RED);
                        g.fillRect(x1+10,y1+121,210,28);
                        
                        //Draw a border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1+10, y1+10,210,139);
                        
                        
                        
                        //Draw Line
                        
                        	
                     
//                     	//Draw Second Line
//                        
//                        g.setColor(Color.CYAN);
//                        g.drawLine(width-45,0, 0, height-86);
//                        
//                        //Draw an Oval
//                        g.setColor(Color.BLACK);
//                        g.fillOval((width-55)/2,(height-55)/2, 55, 55);
                        
                        //Draw Polygons
                        	Polygon p = new Polygon();
                        	p.addPoint(x1 +10,  y1 +10);
                        	p.addPoint(x1 +115, y1 +75);
                        	p.addPoint(x1 +10,  y1 +150);
                        	//p.addPoint(x1 +25,  y1 +25);
                        	//p.addPoint(x1 +25,  y1 +45);
                        	//p.addPoint(x1 +15,  y1 +45);
                        	//p.addPoint(x1 +15,  y1 +25);
                        	g.setColor(Color.BLUE);
                        	g.fillPolygon(p);
                        
                        //Draw Polygon2
                        	Polygon p2 = new Polygon();
                        	p2.addPoint(x1+25, y1+73);
                        	p2.addPoint(x1+41, y1+73);
                        	p2.addPoint(x1+47, y1+58);
                        	p2.addPoint(x1+53, y1+73);
                        	p2.addPoint(x1+69, y1+73);
                        	p2.addPoint(x1+56, y1+83);
                        	p2.addPoint(x1+61, y1+98);
                        	p2.addPoint(x1+47, y1+88);
                        	p2.addPoint(x1+34, y1+98);
                        	p2.addPoint(x1+38, y1+83);
                        	g.setColor(Color.WHITE);
                        	g.fillPolygon(p2);
                        	
                        	
                        	
                        	
                        	
                        	
            }
}