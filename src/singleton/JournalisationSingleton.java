package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JournalisationSingleton {
	
	 private static JournalisationSingleton uniqueInstance ;
	    private String log;

	    
	    private JournalisationSingleton()
	    {
	        log = new String();
	    }

	
	    public static synchronized JournalisationSingleton getInstance()
	    {
	        if(uniqueInstance==null){
	            uniqueInstance=new JournalisationSingleton();
	       }
	        return uniqueInstance;
	    }


	    public synchronized void journaliser(String log)
	    {
	    	 this.log += log + "\n";
	    }

	  
	    public String terminerJournal()
	    {
	         return log;
	    }


	}

