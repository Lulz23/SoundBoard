package view;

import javax.swing.JFrame;
import controller.SoundBoard_Controller;



public class SoundBoard_Frame extends JFrame {

		private SoundBoard_Controller app;
		private SoundBoard_Panel panel;
	
		
		public SoundBoard_Frame(SoundBoard_Controller app)
		{
			super();
			this.app = app;
			this.panel = new SoundBoard_Panel(this.app);
			setupFrame();
		}

		private void setupFrame()
		{
			this.setContentPane(panel);
			this.setTitle("SoundBoard");
			this.setResizable(false);;
			this.setSize(800,800);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
