import javax.swing.JOptionPane;

public class areuhappy {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "are you happy ?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then keep doing what you are doing ;)");
		} else {
			 answer =JOptionPane.showInputDialog(null, "Do you want to be happy?");
		
			if (answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Then change something");
			}	else  {
					 JOptionPane.showMessageDialog(null, "Then keep doing what you are doing");
					
				}
			

		

	}
}}
