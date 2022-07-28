
public class Test1 {
    public static void main(String[] args) {
    	
    	
    	int count = 0;
    	
    	for(int i = 65; i <= 26; i++) {
    	
    	System.out.print((char)i);
    	count++;
    	
    	if (count%5 == 0) {
    		System.out.println();
    		
    		if (count%10 == 0) {
    			i-= 32;
    			}else {
    				i+ = 32;
    			}
    	}
    	}
	}
}
