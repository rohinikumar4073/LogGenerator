package com.loggenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class TailGenerator {

	   // Define a static logger variable so that it references the
	   // Logger instance named "MyApp".
	   static Logger logger = Logger.getLogger(TailGenerator.class);

	   public static void main(String[] args) {
		 //  final String LOG_FILE = "C:/Users/Administrator/workspace/ApacheLogGenerator/src/resources/log4j.properties";
		 final String LOG_FILE = "C:/Users/Admin/Documents/GitHub/ApacheLogGenerator/src/resources/log4j.properties"; 

		      Properties logProp = new Properties();      
		      try     
		      {      
		       logProp.load(new FileInputStream (LOG_FILE));  
		            PropertyConfigurator.configure(logProp);      
		            logger.info("Logging enabled");    
		      }     
		      catch(IOException e)                
		      {       
		     System.out.println("Logging not enabled");       
		                 }  
	     // Set up a simple configuration that logs on the console.
	    for (int i = 0; i<10000; i++) {
	    	if(i%10==0)
	    	logger.error("Entering application.");
		    logger.info("Exiting application.");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	     
	   }


}
