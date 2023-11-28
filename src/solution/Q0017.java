package solution;

import java.util.ArrayList;
import java.util.List;

public class Q0017 {
	
	private static final String[][] LETTERS={
			{},
			{},
			{"a","b","c"},
			{"d","e","f"},
			{"g","h","i"},
			{"j","k","l"},
			{"m","n","o"},
			{"p","q","r","s"},
			{"t","u","v"},
			{"w","x","y","z"}
	};
	
	List<String> rs=new ArrayList<>();
	
	public List<String> letterCombinations(String digits) {
		
        if(digits.length()!=0)
        	convert("",digits);
		
		return rs;
		
    }
	
	public void convert(String letters, String digits) {
			
		if(digits.length()==0)
			rs.add(letters);
		else {
			for(String str:LETTERS[(int)digits.charAt(0)-48])
				convert(letters.concat(str),digits.substring(1));
		}
		
	}
	
	
	
}
