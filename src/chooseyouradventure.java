import javax.swing.JOptionPane;

public class chooseyouradventure {
	public static void main(String[] args) {
		String intro = JOptionPane.showInputDialog(null, "Where would you like to go... A cave or a swamp ");
		if (intro.equals("cave")) {
			String answer =	JOptionPane.showInputDialog(null,
					"You have arrived in a dark and small cave. As you light a torch you see in a corner \n a box of food and gold and diamond jewels are you going to take it?");
			if (answer.equals("no")) {
				JOptionPane.showMessageDialog(null,
						"Good, because you know that was a booby trap and you could have exploded into tiny specs.");
			}	else {
					
					JOptionPane.showMessageDialog(null,
						"Well look at that you have just exploded into small pieces... that box \n was just a booby trap, you have died.( try again for a new adventure)");			
			}
		}	else {
			String answer =	JOptionPane.showInputDialog(null, "You have arrived at a greenish-brown swamp. You hear a weird noise coming from behind you, you look behind you and you see a big ugly troll coming towards you./n Do you want to fight it or run away?");
			if (answer.equals("run away")) {
				JOptionPane.showMessageDialog(null, "You continue to runn deeper into the swamp. After running  you find yourself standing in front of a abandoned house.\n You are now safe from all of the trolls of the swamp.\n To Be Continued");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "You pick up a nearby stick and start hitting him with it. After a while the troll finally gives up and runs away and leaves.\n But then a portal pops up out of the blue, you step in and your suddenly back home.");
			}
		}	
		
		
		}

	}

	
