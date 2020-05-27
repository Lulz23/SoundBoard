package model;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextArea;

public class SoundBoard_Phrases {

	private String [] phrasesArray;
	private ArrayList<String> respondList;
	private ArrayList<String> replies;
	
	
	public SoundBoard_Phrases(String phrases)
	{
		this.phrasesArray = new String [7];
		this.respondList = new ArrayList <String>();
		this.replies = new ArrayList <String>();
		
	
		
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
	
	public String render(String texts)
	{
		String respond = " ";
		
		respondList.add(texts);
		
		int randomIndex = (int) (Math.random()* phrasesArray.length);
		
		replies.add(respond);
		
		return respond;
	}



	
}
