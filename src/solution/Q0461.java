package solution;

public class Q0461 {
	
    public int hammingDistance(int x, int y) {
        
    	int num=x^y;
    	int rs=0;
    	
    	while(num>0) {
    		rs+=num%2;
    		num>>=1;
    	}
    	return rs;
    }
	
    
    
}
