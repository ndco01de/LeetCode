package solution;

import java.util.ArrayList;
import java.util.List;

public class Q0412 {
	
    public List<String> fizzBuzz(int n) {
    	
    	List<String> rs=new ArrayList<>();
    	
    	for(int i=1;i<=n;i++) {
    		
    		if(i%15==0)
    			rs.add("FizzBuzz");
    		else if(i%3==0)
    			rs.add("Fizz");
    		else if(i%5==0)
	    		rs.add("Buzz");
    		else
    			rs.add(String.valueOf(i));
    		
    	}	//end of for
    	return rs;
    }
	
    
    
}
