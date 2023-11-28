package solution;

public class Q0007 {
	
    public int reverse(int x) {
    	
    	int rs=0;
    	
    	if(!canReverse(x)) 
    		return rs;
    	
    	while(x!=0) {
    		rs*=10;
    		rs+=x%10;
    		x/=10;
    	}
    	return rs;
    }
	
    
    private boolean canReverse(int num) {
    	 
    	final int[] MAX= {2,1,4,7,4,8,3,6,4,7};
    	
    	if(num==-2147483648)
    		return false;
    	if(num<0)
    		num*=-1;
    	if(num<1000000000)
    		return true;
    	
    	for(int i=0;i<10;i++) {

    		 int check=num%10;
    		 num/=10;
    		 
    		 if(check>MAX[i])
    			 return false;
    		 else if(check<MAX[i])
    			 return true;
    		 
    	 }	//end of for
    	 return false;
    }
    
    
    
}
