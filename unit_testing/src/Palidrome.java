/**
 * 
 * @author Jason Boutte
 * @author Alejandro Velazquez
 *
 */

public class Palidrome {
    public Boolean isPalidrome(String s) {
    	if (s == null || s.isEmpty()) {
    		return false;
    	}

    	String c = s.toLowerCase();
    	int f = 0;
    	int r = c.length() - 1;
    	
    	while (f < c.length() && r >= 0) {
    		while (f < c.length() && !Character.isAlphabetic(c.charAt(f))) {
    			++f;
    		}
    		
    		while (r > 0 && !Character.isAlphabetic(c.charAt(r))) {
    			--r;
    		}
    		    		
    		if (c.charAt(f) != c.charAt(r)) {
    			return false;
    		}
    		
    		++f;
    		
    		--r;
    	}
    	
        return true;
    }
}
