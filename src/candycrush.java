
//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class candycrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String  answer = JOptionPane.showInputDialog(null, "who don't you like?") ;
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
JOptionPane.showMessageDialog(null, "you sooooo like " +answer );
		// 3. Ask the user for the name of their best friend
 String bestfriend = JOptionPane.showInputDialog(null, "what's your bestfriends name?");
		// 4. Tell them their best friend is as sweet as candy
JOptionPane.showMessageDialog(null,  bestfriend+  " is sweet as candy");
	} 
}



