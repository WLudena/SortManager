package com.sparta.wla.manager;

import com.sparta.wla.display.DisplayManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Starter {

    private static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    private static Logger log = Logger.getLogger(LoggingManager.class);

    public static void main( String[] args )
    {
//        initialiseLogging();
//        LoggingManager loggingManager = new LoggingManager();
//        loggingManager.setMessage("Blah blah blah");
//        loggingManager.displayMessage();
        //String array = new String[5]{"1","1","1","1","1"};

        SortManager sortManager = new SortManager();
        sortManager.sortArray();
    }

    private static void initialiseLogging(){
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        log.debug("Logging initialised");
    }


}
