
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class airlineregistration {  
	public static void main(String[] args) { 
	String firstname = JOptionPane.showInputDialog(null, "WHAT IS YOUR  NAME ?");
String lastname= JOptionPane.showInputDialog(null, "WHAT IS YOUR LAST NAME ?");
String dob= JOptionPane.showInputDialog(null, "WHEN IS YOUR BIRTHDAY ?");
String gender= JOptionPane.showInputDialog(null, "ARE YOU MALE OR FEMALE ?");
String travel= JOptionPane.showInputDialog(null, "WHERE ARE TRAVELING TO ?"); 
JOptionPane.showMessageDialog(null,lastname+"/"+firstname+" ("+dob+","+gender+")\n  Traveling to:"  +travel);



}
}



