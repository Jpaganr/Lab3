import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Javier Pagan");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(640, 280);
		myFrame.setSize(300, 300);
		
		 MyPanelClass myPanel = new MyPanelClass();
         myFrame.getContentPane().add(myPanel);
         myFrame.setVisible(true);
	}
}