package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.HipsterModel;
import hipster.view.HipsterFrame;

public class HipsterController
{
	private HipsterModel [] cubbyHipsters;
	public HipsterModel[] getCubbyHipsters()
	{
		return cubbyHipsters;
	}
	private HipsterModel selfHipster;
	private HipsterFrame appFrame;
	private int hipsterCount;
	
	/**
	 * initializes some values for the controller
	 */
	public HipsterController()
	{
		selfHipster = new HipsterModel();
		
		selfHipster = new HipsterModel();
		cubbyHipsters = new HipsterModel[6];
		hipsterCount = 0;
	}
	public int getHipsterCount()
	{
		return hipsterCount;
	}
	/**
	 * Retrieves the values for the Self Hipster.
	 * @return SelfHipster
	 */
	public HipsterModel getSelfHipster()
	{
		return selfHipster;
	}

	/**
	 * Starts the controller for the user.
	 */
	public void start()
	{
		
		appFrame = new HipsterFrame(this);
	}
	/**
	 * Returns a specified hipster from the Array.
	 * @param position, position in the array of hipsters.
	 * @return specified hipster.
	 */
	public HipsterModel getSpecifiedHipster(int position)
	{
		HipsterModel specifiedHipster = null;
		
		if(position < cubbyHipsters.length && position >= 0)
		{
			specifiedHipster = cubbyHipsters[position];
		}
		
		return specifiedHipster;
	}
	/**
	 * returns a random Hipster from the Array.
	 * @return random Hipster
	 */
	public HipsterModel getRandomHipster()
	{
		HipsterModel currentHipster = null;
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) random*cubbyHipsters.length;
		
		currentHipster = cubbyHipsters[randomIndex];
		
		
		
		return currentHipster;
	}
	/**
	 * adds a hipster with the specified values in to the array of hipsters.
	 * @param books - of the hipster.
	 * @param name - of the hipster.
	 * @param type - of the hipster.
	 * @param phrase - of the hipster.
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < cubbyHipsters.length)
		{
			HipsterModel tempHipster = new HipsterModel(name, type, phrase, books);
			cubbyHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The cubby hipsters are full");
		}
		
	}
}
