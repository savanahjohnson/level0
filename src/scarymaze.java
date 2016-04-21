
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/* A basic version of Aaron's scary maze game
 * http://buildsomethingawesome.org/blog/2012/10/27/scary-maze-game/ */

public class scarymaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;
	private int backgroundColor;

	scarymaze() throws Exception {
		//1. make a maze image and drop it into your default package http://pixlr.com/editor/
		maze = ImageIO.read(getClass().getResource("MAZE2.jpg"));
		//2. set the mouse pointer to the start of your maze using:
// new Robot().mouseMove(xPosition, yPosition)
		new Robot().mouseMove(120,200);
		//new Robot(savbot).mousePress(buttons);
		//3. add a mouse motion listener using:
// addMouseMotionListener(this)
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		//4. print the mouseColor variable to see what color the mouse is touching

	int	backgroundColor = -1;

				// call the scare method
		if (mouseColor==-1) {scare();
			
		}
		//10. if the mouse is on the end color
			
				// pop up a message to tell them they won
	}

	private void scare() {
		System.out.println("BOO!");
		//7. find a scary sound and put it in the "default package" where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		//AudioClip sound = JApplet.newAudioClip(getClass().getResource("scream.wav"));
		//8. play the scary sound. Hint: type "sound" and then a period.		
		
		//9. drop an image into your default package, and use the showScaryImage method to scare your victim!

	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new scarymaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("June's Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {


		// TODO Auto-generated method stub

	}

}




