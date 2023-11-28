package solution;

public class Q0704 {
	
	public int search(int[] nums, int target) {
        
		int len=nums.length;
		int a=0;
		int b=len-1;
		
		while(a<=b) {
			
			int m=a+(b-a)/2;
			int val=nums[m];
			
			if(target>val)
				a=m+1;
			else if(target<val)
				b=m-1;
			else {
				return m;
			}
			
		}	// end of while
		return -1;
    }
	
	
	
}
