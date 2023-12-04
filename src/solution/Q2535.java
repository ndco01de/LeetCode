package solution;

public class Q2535 {

    public int differenceOfSum(int[] nums) {
        
    	int rs=0;
    	for(int num:nums) {
    		rs+=num;
    		while(num!=0) {
    			rs-=num%10;
    			num/=10;
    		}
    	}
    	return Math.abs(rs);
    }
    
    
    
}
