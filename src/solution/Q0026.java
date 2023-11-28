package solution;

public class Q0026 {
	
	public int removeDuplicates(int[] nums) {
	
		int rs=0;
		int val=-101;
		int len=nums.length;
		
		for(int i=0;i<len;i++) {
			int num=nums[i];
			if(num!=val) {
				val=num;
				nums[rs]=val;
				rs++;
			}
		}	//end of for
		return rs;
	}	
	
	
	
}
