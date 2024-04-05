package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class IntegerSetTest {
	private IntegerSet set;
	
	@BeforeEach
	public void SetUp() {
		set = new IntegerSet();
	}
	
	
	
	@Test
	@DisplayName("Test Clear Method")
    public void testClear() {
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }
	
	@Test
	@DisplayName("Test for Length")
	public void testLength() {
		set.add(1);
		set.add(2);
		set.add(3);
		assertEquals(3,set.length());
	}
	
	@Test
	@DisplayName("Test for Equals Method")
	public void testEquals() {
		IntegerSet set2 = new IntegerSet();
		set.add(1);
		set.add(2);
		set.add(3);
		
		set2.add(1);
		set2.add(2);
		assertFalse(set.equals(set2));
	}
	
	@Test
	@DisplayName("Test for Empty")
	public void testIsEmpty() {
		
		assertTrue(set.isEmpty());
		set.add(5);
		assertFalse(set.isEmpty());
		set.remove(5);
		assertTrue(set.isEmpty());
		
	}
	@Test
    @DisplayName("Test Contains Method")
    public void testContains() {
        set.add(7);
        set.add(15);
        assertTrue(set.contains(7));
        assertFalse(set.contains(3));
    }
	
	
	@Test
    @DisplayName("Test Add Method")
    public void testAdd() {
        set.add(44);
        set.add(2);
        assertTrue(set.contains(44));
        assertTrue(set.contains(2));
        assertNotEquals(5, set.length());
    }
	
	
	@Test
    @DisplayName("Test Remove Method")
    public void testRemove() {
        set.add(1);
        set.add(2);
        set.add(5);
        set.remove(2);
        assertFalse(set.contains(2));
        assertEquals(2, set.length());
        assertNotEquals(5,set.length());
    }
	
	@Test
    @DisplayName("Test Intersect Method")
    public void testIntersect() {
        IntegerSet setB = new IntegerSet();
        set.add(33);
        set.add(22);
        setB.add(22);
        setB.add(10);
        set.intersect(setB);
        assertFalse(set.contains(1));
        assertTrue(set.contains(22));
        assertFalse(set.contains(3));
    }
	
	@Test
    @DisplayName("Test To String Method")
    public void testToString() {
        set.add(1);
        set.add(2);
        set.add(5);
        assertEquals("(1,2,5)", set.toString());
        assertNotEquals("(3,4,5)", set.toString());
    }
	
	@Test
    @DisplayName("Test Diff Method")
    public void testDiff() {
        IntegerSet setB = new IntegerSet();
        set.add(2);
        set.add(81);
        set.add(3);
        setB.add(2);
        set.diff(setB);
        assertTrue(set.contains(81));
        assertFalse(set.contains(2));
        assertTrue(set.contains(3));
        assertEquals(2, set.length());
    }
	
	@Test
    @DisplayName("Test Union Method")
    public void testUnion() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(10);
        setB.add(10);
        setB.add(3);
        set.union(setB);
        assertTrue(set.contains(1));
        assertTrue(set.contains(10));
        assertFalse(set.contains(4));
        assertTrue(set.contains(3));
        assertEquals(3, set.length());
    }
	
	@Test
    @DisplayName("Test for Complement Method")
    public void testComplement() {
        IntegerSet setB = new IntegerSet();
        set.add(1);
        set.add(2);
        setB.add(2);
        setB.add(3);
        set.complement(setB);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertFalse(set.contains(3));
        
    }
	
	@Test
	@DisplayName("Test Smallest Method")
	public void testSmallest() {
	   
	    IntegerSet set = new IntegerSet();
	    set.add(5);
	    set.add(3);
	    set.add(1);

	   
	    int result;
	    try {
	        result = set.smallest();
	       
	        assertEquals(1, result, "Smallest element should be 1");
	    } catch (IntegerSetException e) {
	        fail("Unexpected IntegerSetException: " + e.getMessage());
	    }
	}
	
	
	
		
		
	
	
	@Test
	@DisplayName("Test Largest Method")
	public void testLargest() {
	   
	    IntegerSet set = new IntegerSet();
	    set.add(1);
	    set.add(3);
	    set.add(20);

	    
	    int result;
	    try {
	        result = set.largest();
	        
	        assertEquals(20, result, "Largest element should be 20");
	    } catch (Exception e) {
	        // Fail test  if unexpected exception occurs
	        fail("Unexpected Exception: " + e.getMessage());
	    }
	}


	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
