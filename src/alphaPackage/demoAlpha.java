package alphaPackage;
import org.apache.logging.log4j.*;  //this for import the log4j .jar files.
public class demoAlpha {
	// Define a static logger variable so that it references the
	// Logger instance named "demoAlpha" or "MyApp".
	// static final Logger logger = LogManager.getLogger(MyApp.class.getName());
	// ANOTHER ONE: create a logger object for the java class (demoAlpha) we are coding
	private static Logger myLogger = LogManager.getLogger(demoAlpha.class.getName());	
	//above is the only thing we have to do in order to use the log4j log in our class, just change the className and
	// remember the import in line # 2. With this ALL the myLog.debug, myLog.info, myLogger.error and myLogger.fatal will be  
	// displayed in the LOG FILE because this java class "demoAlpha" is defined in the log4j2.xml configuration file (see
	// lines #10 (log file definition) and 23 (logger definition)).
	// if we don't include the java class in the configuration file for log4j, then only the default logs will be displayed in 
	// the output CONSOLE, and these default logs are myLog.error("zzzz") and myLog.fatal("xxxx"); so these won't be displayed: 
	// myLog.debug("rrrr");   and myLog.info("eeee"); in the console. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myLogger.debug("Clicked on Home Page link. (*** SAY WHAT WAS EXECUTED, this is the use of \".debug\") ");
		myLogger.info("Home Page is displayed (*** ALL IS AS EXPECTED, this is the use of \".info\")");
		myLogger.error("Home Page was NOT displayed. (*** THIS IS AN ERROR, this is the use of \".error\")");
		myLogger.fatal("Save button is missing. (*** THIS IS AN FATAL, this is the use of \".fatal\")");
		
		
	}

}
