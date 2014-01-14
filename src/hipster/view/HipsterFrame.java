package hipster.view;

import javax.swing.JFrame;

import hipster.controller.HipsterController;
import hipster.controller.HipsterController;

public class HipsterFrame extends JFrame
{



	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
