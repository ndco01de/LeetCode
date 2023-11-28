package solution;

import java.util.HashMap;
import java.util.Map;

public class Q0001 {

	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		int len=nums.length;
		for(int i=0;i<len;i++) {
			
			int diff=target-nums[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}
			map.put(nums[i],i);
			
		}	//end of for
		return new int[]{-1,-1};
	}

	
	
}
