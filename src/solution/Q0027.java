package solution;

public class Q0027 {

	public int removeElement(int[] nums, int val) {

		int len = nums.length;
		int p = len;
		
		for (int i = len-1; i >= 0; i--) {
			if (nums[i] == val)
				nums[i] = nums[--p];
		}
		return p;
	}

	
	
}
