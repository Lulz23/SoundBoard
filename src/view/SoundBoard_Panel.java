package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
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
		soundButton0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				try 
				{
					soundButton0 = new File("src/");
				}
			}
			});
	}
	
	public void setupLayout()
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
