package view;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import controller.SoundBoard_Controller;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class SoundBoard_Panel extends JPanel implements ActionListener
{
	/**
	 * Constructor for SoundBoard Panel
	 * 
	 * 
	 */
	private SoundBoard_Controller app;
	private SpringLayout appLayout;
	
	private JButton soundButton0;
	private JButton randomButton;
	private JTextArea texts;
	private JTextField text;
	
	AudioInputStream ais;
	Clip clip;
	
	File a;
	
	public SoundBoard_Panel(SoundBoard_Controller app)
	{
		super();
		this.app = app;
			
		this.appLayout = new SpringLayout();
		
		this.texts = new JTextArea(20, 40);
		this.text = new JTextField("", 20);
		this.soundButton0 = new JButton("Sound 1");
		this.randomButton = new JButton("Random Button");
		
		
		setupPanel();
		setupLayout();
		setupListener();
		
	}
	
	public void setupPanel()
	{
		this.setBackground(Color.BLACK);
	
		this.add(soundButton0);
		this.add(randomButton);
		this.add(texts);
	}	
	
	public void setupListener()
	{
		/**
		 * This adds sounds to the sound buttons
		 * This also adds the random phrases from the random phrases model.
		 */
		
		
		randomButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click) {
						
						
						updateScreen();
					}
				});
		
		try 
		{
			soundButton0.addActionListener(this);
			a = new File("src/sounds/sound3.wav");
			ais = AudioSystem.getAudioInputStream(a);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void setupLayout()
	{
		
	}

	
	public void actionPerformed(ActionEvent evt) 
	{
		
		
		
		if(evt.getSource() == soundButton0)
		{
			try 
			{
				clip.start();
				clip.setFramePosition(0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		
	}
	private void updateScreen()
	{
		String phrases = text.getText();
		texts.setText("");
		String response = app.randomPhrases(phrases);
		texts.append(response);;
		
		texts.setCaretPosition(texts.getSelectionEnd());
		
	}
}
