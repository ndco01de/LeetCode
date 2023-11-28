package solution;

public class Q0191 {
	
    public int hammingWeight(int n) {
        
    	int rs;
    	
    	if(n<0) {
    		rs=32;
    		n=-1*(n+1);
    		while(n>0) {
        		rs-=n%2;
        		n/=2;
        	}
    	}
    	else {
    		rs=0;
    		while(n>0) {
        		rs+=n%2;
        		n/=2;
        	}
    	}
    	
    	return rs;
    }
	
    
    
}
