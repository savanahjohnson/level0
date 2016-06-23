

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;


/*** Teacher's note ***/
 /* Before beginning recipe: 
 * 1. ask students to find and explain the variables in this recipe. 
 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

public class ninjastar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms

		
Robot savBot = new Robot();
savBot.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		savBot.setX(400);
		savBot.setY(400);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
savBot.setSpeed(19);
		// 13. Make all the code below repeat 25 times
for (int i = 0; i < 25; i++) {
	

	
					savBot.turn(baseSize);
			
savBot.move(64);
			
	
			savBot.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
			savBot.move(flameSize);
			// 6. Turn the robot 170 degrees
			savBot.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			savBot.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			savBot.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			savBot.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		savBot.setRandomPenColor();
	}

	}}



