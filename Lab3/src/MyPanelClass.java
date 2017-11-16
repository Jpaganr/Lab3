import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
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
                        
//                        //Draw a border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a second border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+20,y1+20,width-40,height-40);
//                        
//                        //Draw Line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                      //Draw Second Line
//                        
//                        g.setColor(Color.CYAN);
//                        g.drawLine(width, 0, 0, height);
                        
                        //Draw an Oval
                        g.setColor(Color.BLACK);
                        g.fillOval((width-55)/2,(height-55)/2, 55, 55);
            }
}