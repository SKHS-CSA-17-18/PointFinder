import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * Author: Drew Wadsworth
 * Date: 28 Feb 17
 * 
 * PointFinder is a Java class that prints to the console the
 * coordinates of a point clicked by the mouse in a JFrame.
 * PointFinder is designed to be used by programmers using
 * JFrame who need to know the coordinates of a point or
 * points in the JFrame window.
 * 
 * Coordinates are printed in the (x,y) format.
 * 
 * Note that PointFinder is set to a menu bar (the thing at
 * the top of the window) width of 23. You may have to change
 * this value depending on your operating system. If you do
 * not want to take into account the menu bar, just set the 
 * MENU_BAR_WIDTH variable to 0.
 * 
 * Feel free to use PointFinder in any way.
 */
public class PointFinder extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	static final PointFinder display = new PointFinder(); //JFrame
	static final int MENU_BAR_WIDTH = 23;
	static final int WINDOW_WIDTH = 500;
	
	public static void main(String[] args)
	{
		//Setting up JFrame window
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Ends program when closed
		display.setSize(WINDOW_WIDTH, WINDOW_WIDTH + MENU_BAR_WIDTH);	//Size of window
		display.setVisible(true);			//Displays window
		display.addMouseListener(display);	//Mouse listener for user input
	}

	//Prints coordinates to the console on click
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("(" + e.getX() + "," +  (e.getY() - MENU_BAR_WIDTH) + ")");
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}