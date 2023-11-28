package solution;

public class Q0941 {
	
    public boolean validMountainArray(int[] arr) {
        
    	int len=arr.length;
    	
    	//陣列長度判斷
    	if(len<3)
    		return false;
    	
    	int num=arr[0];
    	int i=1;
    	int next;
    	
    	//走訪嚴格遞增區間
    	while(i<len) {
    		next=arr[i];
    		if(num>=next){break;}
    		num=next;
    		i++;
    	}
    	
    	//此時arr[i-1]為local maximum
    	//排除開頭沒有遞增或結尾沒有遞減的陣列
    	if(i==1 || i== len)
    		return false;
    	
    	//走訪嚴格遞減區間
    	while(i<len) {
    		next=arr[i];
    		if(num<=next){break;}
    		num=next;
    		i++;
    	}
    	
    	//此時arr[i-1]為local minimum
    	if( i!= len)
    		return false;
    	else
    		return true;
    }
    
    
    
}
