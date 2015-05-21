//Hello World

public class Main
{
	private boolean running;
	private static GUI gui;
	private static Text txt;
	
	public Main()
	{
		running  = true;
	}
	
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        gui = new GUI();
        start();
    }

    public static void start()
    {
    	txt = new Text(gui);
    	while(!txt.isExiting())
    	{
    		
    	}
    }

}