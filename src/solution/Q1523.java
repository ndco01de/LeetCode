package solution;

public class Q1523 {

    public int countOdds(int low, int high) {
        
    	int num=high-low+1;
    	
    	if(num%2==0) {		//一奇一偶
    		return num/2;
    	}
    	else {
    		if(low%2==1)	//皆為奇數
    			return num/2+1;
    		else 			//皆為偶數
    			return num/2;
    	}
    	
    }
    
    
    
}
