package solution;

public class Q0066 {

	public int[] plusOne(int[] digits) {

		int len = digits.length;
		boolean carry = true;

		for (int i = len - 1; i >= 0; i--) {
			
			if (carry) {
				if (digits[i] == 9) {
					digits[i] = 0;
					carry = true;
				} else {
					digits[i]++;
					carry = false;
				}
			} else {
				break;
			}
			
		} // end of for

		if (carry)
			return newDigits(len + 1);
		else
			return digits;
	}

	private int[] newDigits(int len) {

		int[] arr = new int[len];
		arr[0] = 1;

		for (int i = 1; i < len; i++) {
			arr[i] = 0;
		}
		
		return arr;
	}

	
	
}
