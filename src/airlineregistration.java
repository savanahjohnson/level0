// Copyright Wintriss Technical Schools 2013
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
public class airlineregistration { public static void main(String[] args) { 
 String name=JOptionPane.showInputDialog(null, "what's your first name?");
 String last=JOptionPane.showInputDialog(null,"what's your last name" );
 String place=JOptionPane.showInputDialog(null,"where is your destination?");
 String birth=JOptionPane.showInputDialog(null, "when is your birthday?");
JOptionPane.showMessageDialog(null,last+"/"+name+"\n birth"  );
}
}






