package loop.controller;

/**
 * Runner for the Loop Project.
 * @author Ryan Thomason
 * @version 1.0 11/5/13 Created the file and documented.
 */
public class LoopRunner
{

	/**
	 * Starts the application.
	 * @param args Unused since this is a GUI application.
	 */
	public static void main(String[] args)
	{
		LoopController myController = new LoopController();
		myController.start();
	}

}
