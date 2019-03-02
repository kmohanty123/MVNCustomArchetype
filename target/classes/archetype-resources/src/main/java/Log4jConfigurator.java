package $package;

public class Log4jConfigurator 
{
	
	private final static Log4jConfigurator INSTANCE = new Log4jConfigurator();

	public static Log4jConfigurator getInstance()
	{
		return INSTANCE;
	}

	//This method will start the watcher of log4j.xml file and also configure the loggers
	public void initilize(final String file) {
		try 
		{
			
			Log4jWatcher listner = new Log4jWatcher(file);
			
			//Start the thread
			Thread listenlog=new Thread(listner);
			listenlog.start();
			if(!listenlog.isAlive()){
				listenlog.start();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
