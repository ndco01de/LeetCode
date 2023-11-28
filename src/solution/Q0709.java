package solution;

public class Q0709 {

    public String toLowerCase(String s) {
        
    	StringBuilder rs=new StringBuilder("");
    	for(char ch:s.toCharArray()) {
    		if(ch>='A' && ch<='Z')
    			ch+=32;
    		rs.append(ch);
    	}
    	return rs.toString();
    }
    
    
    
}
