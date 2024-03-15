package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

	public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        
        // Testing contains method
        System.out.println("Range1 contains 5: " + range1.contains(5)); 
        System.out.println("Range2 contains 20: " + range2.contains(20)); 
        
        // Testing overlaps method
        System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2)); 
        
        // Testing size method
        System.out.println("Size of Range1: " + range1.size()); 

        // Testing equals method
        IntegerRange range3 = new IntegerRange(1, 10);
        System.out.println("Range1 equals Range3: " + range1.equals(range3)); 
        System.out.println("Range1 equals Range2: " + range1.equals(range2)); 
    }
}

