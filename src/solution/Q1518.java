package solution;

public class Q1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        
    	int rs=numBottles;
    	
    	while(numBottles>=numExchange) {
    		int get=numBottles/numExchange;	//換到幾瓶
    		numBottles%=numExchange;	//剩幾瓶空瓶
    		numBottles+=get;	//加上新換到的瓶子
    		rs+=get;
    	}
    	return rs;
    }
    
    
    
}
