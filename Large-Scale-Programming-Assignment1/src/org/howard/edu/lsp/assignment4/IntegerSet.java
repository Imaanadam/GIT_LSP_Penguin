package org.howard.edu.lsp.assignment4;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class of integers that can have different operations performed on it
 */
public class IntegerSet {
	
	private List<Integer> array;
	
	/**
     * storing elements in an array list
     */
	
	public IntegerSet() {
		array = new ArrayList<Integer>();
		
	}
	 /**
     * clears the internal representation of the set
     */
	
	public void clear(){
		array.clear();
		
	}
	/**
	 * returns the  length of set
	 * @return length of the set
	 */
	public int length() {
		return array.size();
	}
	/**
	*@return true if the two sets are equal,false otherwise, checks their size first then content
	*@param setB is an integer set
	*/
	public boolean equals(IntegerSet setB) {
		if (array.size()!= setB.length()) {
			return false;
		}
	for(int item : setB.array) {
		if (!array.contains(item)) {
			return false;
		}
	}
	return true;
	
	}
	/**
	 *  @return true if empty
	 *  
	 */
	public boolean isEmpty() {
		return array.isEmpty();
	}
	/**
	*@return largest element in array,Throws a IntegerSetException if the set is empty 
	* @throws Exception will say array is empty if no elements are found when checking for largest 
	*/
	public int largest() throws Exception{
		if(array.isEmpty()) {
			throw new Exception("Array is empty");
			
		}
		return Collections.max(array);
	}
	/**
	*finds smallest element in array;Throws a IntegerSetException if the set is empty
	*@return smallest element in set
	* @throws IntegerSetException will send message array is empty if no elements are found
	*/
	public int smallest() throws IntegerSetException{
		if (array.isEmpty()) {
			throw new IntegerSetException("array is empty");
			
		}
		int smallest = array.get(0);
		for (int element : array) {
			if (element<smallest) {
				smallest = element;
			}
		}
		return smallest;
	}
	/**
	*checks if array contains a certain value, false if not
	*@return value if the given value is found in the set
	*@param value; is the number we are searching for
	*/
	
	public boolean contains(int value) {
		return array.contains(value);
	}
	/** 
	*Adds an item to the set or does nothing it already there
	*@param item; is a integer to be added
	*/
	public void add(int item) {
		if(!array.contains(item)) {
			array.add(item);
		}
	}
	/**
	 * removing an item of integer value from array, does nothing if not there
	 * @param item; is a integer to be removed
	*/
	public void remove(int item) {
		array.remove(Integer.valueOf(item));
		
	}
	/**
	 *  Set intersection, all elements in s1 and s2
	 *  @param setB; will contain all elements in s1 and s2 that are the same
	*/
	
	public void intersect(IntegerSet setB) {
		array.retainAll(setB.array);
	}
	/**
	 * Union: all elements in set and setB
	 * @param setB; 
	*/
	public void union(IntegerSet setB) {
		for (int item : setB.array) {
			if(!array.contains(item)) {
				array.add(item);
			}
		}
	}
	/**
	 * set subtraction S1-S2
	 * @param setB; will hold the elements subtracted from set1
	*/
	public void diff(IntegerSet setB) {
		array.removeAll(setB.array);
	}
	/**
	 *  @return String representation of your set
	*/
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		for (int i=0; i<array.size(); i++) {
			sb.append(array.get(i));
			if (i !=array.size()- 1) {
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();
		
	}
	/**
	 *  all elements not in set that are not shared by setB as well
	 *  @param intSetB; this stores the elements not in set that are not shared by setB
	*/
	public void complement(IntegerSet intSetB) {
		List<Integer> addElement = new ArrayList<Integer>();
		for(int i: intSetB.array) {
			if( !array.contains(i)) {
				addElement.add(i);
			}
		}
		array.clear();
		for(int item: addElement) {
			array.add(item);
		}
	}
	

	
	
	
	
}
