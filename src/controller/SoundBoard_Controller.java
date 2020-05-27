package controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import model.SoundBoard_Phrases;



import view.SoundBoard_Panel;
import view.SoundBoard_Frame;

public class SoundBoard_Controller {

	private SoundBoard_Phrases phrases;
	
	
	
	
	public void start()
	{
		
		
		
		
		
	}

	private SoundBoard_Frame appFrame;
	
	public SoundBoard_Controller()
	{
		appFrame = new SoundBoard_Frame(this);
	
		
		
	}


	public String randomPhrases(String text)
	{
		String output = "";
		
		output = phrases.render();
		return output;
		
		
	}
	
}
