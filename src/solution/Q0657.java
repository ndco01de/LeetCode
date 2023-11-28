package solution;

public class Q0657 {
	
    public boolean judgeCircle(String moves) {
        
    	int x=0;
    	int y=0;
    	
    	for(char ch : moves.toCharArray()) {
    		switch(ch){
    			case 'U'->x+=1;
    			case 'D'->x-=1;
    			case 'L'->y-=1;
    			case 'R'->y+=1;
    		}
    	}
    	return x==0 && y==0;
    }
    
    
    
}
