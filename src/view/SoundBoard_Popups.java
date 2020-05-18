package view;

import javax.swing.JOptionPane;

/**
 * 
 * Creates popup window for asking questions.
 * @author blues
 *
 */

public class SoundBoard_Popups {

	
	public void displaytext(String text)
	{
		JOptionPane.showMessageDialog(null, text);
		
	}
	
	
	public String question(String text)
	{
		String answers = "" + JOptionPane.showInputDialog(null, text);
		
		return answers;
		
	}
}
