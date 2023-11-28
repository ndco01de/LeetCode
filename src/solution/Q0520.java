package solution;

public class Q0520 {

    public boolean detectCapitalUse(String word) {
        
    	int len=word.length();
    	
    	if(len==1)
    		return true;
    	
    	
    	if(word.charAt(0)<'a' && word.charAt(1)<'a') {
    		//前兩個字母皆為大寫
    		for(int i=2;i<len;i++){
    			if(word.charAt(i)>='a'){return false;}
    		}
    	}
    	else {
    		//前兩個字母包含小寫
    		for(int i=1;i<len;i++){
    			if(word.charAt(i)<'a'){return false;}
    		}
    	}
    	return true;
    }

    
    
}
