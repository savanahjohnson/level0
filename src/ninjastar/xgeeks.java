package ninjastar;

// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class xgeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable
	String mychal = "INVISIBLITY";
	String savanah = "FLYING";
	String maria = "TELEPORTATION";
	String wren = "TRANSFORMER";
		// 2. Ask the user to enter a name. Store their answer in a varible
			String answer = JOptionPane.showInputDialog(null, "Enter a name below.");
			if (answer.equals("mychal") ) { JOptionPane.showMessageDialog(null, "INVISIBILITY");
			
				
			}
			if (answer.equals("maria")) { JOptionPane.showMessageDialog(null, "TELEPORTATION");
				
			}
			
		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}


