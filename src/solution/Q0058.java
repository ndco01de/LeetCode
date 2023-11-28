package solution;

public class Q0058 {
	
	public int lengthOfLastWord(String s) {
        
		s=s.trim();
        int num=s.lastIndexOf(' ');
        
        if(num==-1)
        	return s.length();
        else
        	return (s.length()-1)-num;
        
    }



}
