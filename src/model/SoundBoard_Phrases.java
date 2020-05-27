package model;

import java.util.ArrayList;

public class SoundBoard_Phrases {

	private String [] phrasesArray;
	
	
	
	public SoundBoard_Phrases(String phrases)
	{
		this.phrasesArray = new String [7];
	
		
		
		setupPharses();
	}
	
	
	public void setupPharses()
	{
		this.phrasesArray[0] = "Something new";
		this.phrasesArray[1] = "Ya like jazz?";
		this.phrasesArray[2] = "I enjoy fried rice";
		this.phrasesArray[3] = "Pretty stuff is pretty";
		this.phrasesArray[4] = "Random Statement here";
		this.phrasesArray[5] = "This is pretty coool";
		this.phrasesArray[6] = "This will need work";
	}
	
	public String render()
	{
		String respond = "";
		
		int randomPhrase = (int) (Math.random() * phrasesArray.length);
		
		randomPhrase = (int) (Math.random()* phrasesArray.length);
		
		
		return respond;
		
	}
	
	
}
