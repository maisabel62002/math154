package math154.finalproject;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class LoadClip {
	Clip load( String filename)//load large music file beforehand
	{
	    Clip clip = null;
	    try
	    {
	    	File file = new File(filename); 
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioInput);
			Thread.sleep(2000);
	    }
	    catch( Exception e )
	    {
	        e.printStackTrace();
	    }
	    return clip;
	}

}
