package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

/**
 * Controller object for the Loop project.
 * 
 * @author Ryan Thomason
 * @version 1.1 11/5/13 Added data members and start method. Added the
 *          Constructor.
 */
public class LoopController
{
	private LoopFrame appFrame;
	private Looper myLooper;
	private int clickCount;

	/**
	 * Initializes values for the Controller object.
	 */
	public LoopController()
	{
		this.myLooper = new Looper();
		clickCount = 0;
	}

	/**
	 * Starts the application.
	 */
	public void start()
	{
		appFrame = new LoopFrame(this);
	}

	private String getText(int position)
	{
		String results = "";

		if (position > -1 && position < myLooper.getGraveNameList().size())
		{
			results = myLooper.getGraveNameList().get(position);
		}

		return results;
	}

	public String getLoopResults()
	{
		String currentResults = loopBackwardOverList();

		return currentResults;
	}
	
	private String loopOverList()
	{
		String loopedData = "";
		
		for(int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}
	
	private String loopBackwardOverList()
	{
		String loopedData = "";
		
		for(int position = myLooper.getGraveNameList().size() - 1; position >= 0; position--)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}

	public String getOtherLoopResults()
	{
		int currentResults = myLooper.loopTestThree();
		String number = "" + currentResults;
		return number;
	}

}
