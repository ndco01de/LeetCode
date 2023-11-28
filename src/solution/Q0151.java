package solution;

public class Q0151 {
	
	 public String reverseWords(String s) {
		 
		 StringBuilder rs=new StringBuilder("");
		 int right=s.length();
		 int left;
		 
		 while( right != -1 ) {
			 
			 left=s.lastIndexOf(" ", right-1);
			 
			 if(left+1 != right)
				 rs.append(" ").append(s.substring(left+1,right));
			 
			 right=left;
		 }	//end of while
		 return rs.toString().substring(1);
	 }
	 
	 
	 
}
