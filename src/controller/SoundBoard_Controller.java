package controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	
		phrases = new SoundBoard_Phrases("idk");
		
	}


	public String randomPhrases(String texts)
	{
		String output = "";
		
		output = phrases.render(texts);
		return output;
		
		
	}

	
}
