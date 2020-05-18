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
	private JButton soundButton1;
	private JButton soundButton2;
	private JButton soundButton3;
	private JButton soundButton4;	
	
	AudioInputStream ais;
	AudioInputStream s;
	Clip clip;
	Clip clip2;
	Clip clip3;
	
	File a;
	File b;
	File c;
	File d;
	File e;
	
	
	public SoundBoard_Panel(SoundBoard_Controller controller)
	{
		super();
		this.controller = controller;
			
		this.appLayout = new SpringLayout();
	
		this.soundButton0 = new JButton("Sound 1");
		this.soundButton1 = new JButton("Sound 2");
		this.soundButton2 = new JButton("Sound 3");
		this.soundButton3 = new JButton("Sound 4");
		this.soundButton4 = new JButton("Sound 5");
	
		setupPanel();
		setupLayout();
		setupListener();
		
	}
	
	public void setupPanel()
	{
		this.setBackground(Color.BLACK);
	
		this.add(soundButton0);
		this.add(soundButton1);
		this.add(soundButton2);
		this.add(soundButton3);
		this.add(soundButton4);
	
	
	}	
	
	public void setupListener()
	{
		try 
		{
			soundButton0.addActionListener(this);
			a = new File("src/sounds/sound0.wav");
			ais = AudioSystem.getAudioInputStream(a);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			soundButton1.addActionListener(this);
			b = new File("src/sounds/sound1.wav");
			s = AudioSystem.getAudioInputStream(b);
			clip2 = AudioSystem.getClip();
			clip2.open(s);
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
				clip2.start();
				clip2.setFramePosition(0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		
	}
	
	
	public void actionPerformed1(ActionEvent evt) 
	{
		if(evt.getSource() == soundButton1)
		{
			try 
			{
				clip2.start();
				clip2.setFramePosition(0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		
	}
}
