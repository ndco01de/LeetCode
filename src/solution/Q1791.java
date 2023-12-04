package solution;

public class Q1791 {

    public int findCenter(int[][] edges) {
        
    	int e00=edges[0][0];
    	
    	if(e00 == edges[1][0] || e00 == edges[1][1])
    		return e00; 
    	else
    		return edges[0][1];
    }
    
    
    
}
