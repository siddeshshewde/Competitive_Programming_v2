import java.util.*;
import java.io.*;

public class SmileFaces {
  
  	public static int countSmileys(List<String> arr) {
      
      	int count = 0;

        //Checking for an Empty ArrayList
      	if (arr.isEmpty())
      	{
         	return count;
      	}
    
      //Counting Number of Smiley's
    	for (int i = 0 ; i < arr.size() ; i++)
    	{
    		if (arr.get(i).equals(":)") || arr.get(i).equals(":D") || arr.get(i).equals(";D") || arr.get(i).equals(";)") || arr.get(i).equals(":-)") || arr.get(i).equals(":-D") || arr.get(i).equals(";-)") || arr.get(i).equals(";-D") || arr.get(i).equals(":~)") || arr.get(i).equals(":~D") || arr.get(i).equals(";~)") || arr.get(i).equals(";~D"))
    		{
            count++;
        	}
    	}
      	
      	return count;

	}
}