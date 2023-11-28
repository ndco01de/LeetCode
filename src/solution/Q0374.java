package solution;

public class Q0374 {
	//api
	int guess(int num) {
		return 0;
	}
	
	public int guessNumber(int n) {
	        
		int a=1;
		int b=n;
		
		while(a<=b) {
			
			int m=a+(b-a)/2;
			int val=guess(m);
			
			if(val==1)
				a=m+1;
			else if(val==-1)
				b=m-1;
			else
				return m;
			
		}	//end of while
		return 0;
	}
	
	
	
}
