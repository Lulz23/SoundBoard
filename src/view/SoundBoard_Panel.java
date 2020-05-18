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
	private SoundBoard_Controller controller;
	private SpringLayout appLayout;
	
	private JButton soundButton0;
	private JButton randomButton;
	
	
	AudioInputStream ais;
	Clip clip;
	
	File a;
	
	public SoundBoard_Panel(SoundBoard_Controller controller)
	{
		super();
		this.controller = controller;
			
		this.appLayout = new SpringLayout();
	
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
	}	
	
	public void setupListener()
	{
		/**
		 * This adds sounds to the sound buttons
		 * 
		 */
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
	
}
