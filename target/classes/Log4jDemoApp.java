
public class Log4jDemoApp {

	private static final String LOG_FILE_PATH = "C:/custom-maven-archetype/src/main/resources/archetype-resources/src/main/resources/log4j.properties";
    public static void main(String[] args)
    {
    	//Configure logger service
    			Log4jConfigurator.getInstance().initilize(LOG_FILE_PATH);
    			
    			//Get logger instance
    			Logger LOGGER = Logger.getLogger(Log4jConfigReloadExample.class);
    			
    			//Print the log messages and wait for log4j changes
    			while(true)
    			{
    				//Debug level log message
    				LOGGER.debug("A debug message !!");
    				//Info level log message
    				LOGGER.info("A info message !!");
    				
    				//Wait between log messages
    				Thread.sleep(2000);
    			}
    }
}
