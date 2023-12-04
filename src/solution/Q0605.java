package solution;

public class Q0605 {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		int capacity = 0;	//紀錄最大可插花空間
		int len = flowerbed.length;
		int zeros = 0;		//記錄連續0個數	
		
		zeros++;			//邊界

		for (int i = 0; i < len; i++) {
			if (flowerbed[i] == 0) {
				zeros++;
			} 
			else {
				if (zeros > 2) 
					capacity += (zeros - 1) / 2;
				zeros = 0;
			}
		}	//end of for
		
		zeros++;			//邊界
		
		if (zeros > 2) 
			capacity += (zeros - 1) / 2;
		
		if(n>capacity)
			return false;
		else
			return true;
	}

	
	
}

