package solution;

public class Q0035 {
	
	 public int searchInsert(int[] nums, int target) {
	        
		 	int a=0;
		 	int b=nums.length-1;
		 		
	 		while(a<=b) {
	 			
	 			int mid=(a+b)/2;
	 			int num=nums[mid];
	 			
	 			if(target>num)
	 				a=mid+1;
	 			else if(target<num)
	 				b=mid-1;
	 			else
	 				return mid;
	 			
	 		}	//end of while
		 	return a;
	    }
	 
	 
	 
}
