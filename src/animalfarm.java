import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class animalfarm {

	animalfarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 *
		 */
		for (int i = 0; i < 3.; i++){
		int animal = JOptionPane.showOptionDialog(null, "what animal do you want?", "pick a animal", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "duck", "cow", "dog" ,"llama" }, null);
		/* 2. Make it so that the user can keep entering new animals. */

			
		
if (animal== 2) playMoo();
if (animal== 3) playLlama();
if (animal==1) playQuack();
if (animal==0) playWoof();
		
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
		
	}
	void playLlama() {
		playNoise(llamaFile);}
	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new animalfarm();
	}

}





