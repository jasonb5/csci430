import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Jason Boutte
 * @author Alejandro Velazquez
 *
 */

public class PalidromeTest {
    private Palidrome pali;
    
    @Before
    public void setup() throws Exception {
        pali = new Palidrome();
    }
    
    @Test
    public void testNullString() {
    	String s = null;
    	
    	Boolean r = pali.isPalidrome(s);
    	
    	assertFalse(r);
    }
    
    @Test
    public void testEmptyString() {
    	String s = "";
    	
    	Boolean r = pali.isPalidrome(s);
    	
    	assertFalse(r);
    }
    
    @Test
    public void testNonPalidromeString() {
    	String s = "mentor";
    	
    	Boolean r = pali.isPalidrome(s);
    	
    	assertFalse(r);
    }
    
    @Test
    public void testMixedCaseString() {
    	String s = "Aba";
    
    	Boolean r = pali.isPalidrome(s);
    	
    	assertTrue(r);
    }
    
    @Test
    public void testNonAlphaCharString() {
    	String s = "A man, a plan, a canal: Panama";
    	
    	Boolean r = pali.isPalidrome(s);
    	
    	assertTrue(r);
    }
    
    @Test
    public void testEvenString() {
    	String s = "Abba";
    	
    	Boolean r = pali.isPalidrome(s);
    	
    	assertTrue(r);
    }
    
    @Test
    public void testOddString() {
    	String s = "Aba";
    	
    	Boolean r = pali.isPalidrome(s);
    	
    	assertTrue(r);
    }
}
