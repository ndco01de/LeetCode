package solution;

public class Q0006 {
	
	public String convert(String s, int numRows) {
        
		int sLen=s.length();
		
		if(numRows==1 || sLen<numRows)
			return s;

		StringBuilder rs=new StringBuilder();
		
		int d=2*(numRows-1);
		
		//first row
		for(int i=0;i<sLen;i+=d) {
			rs.append(s.charAt(i));
		}
		
		//inner row
		for(int row=1;row<numRows-1;row++) {
			
			boolean flag=true;
			int index=row;
			
			while(index<sLen) {
				
				rs.append(s.charAt(index));
				
				if(flag)
					index+=d-2*row;
				else
					index+=2*row;
				
				flag=!flag;
				
			}	//end of while
		}	//end of for
		
		//last row
		for(int i=numRows-1;i<sLen;i+=d) {
			rs.append(s.charAt(i));
		}
		return rs.toString();
    }
	
	
	
}
