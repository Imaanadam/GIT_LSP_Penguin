package org.howard.edu.lsp.midterm.question2;

/**
 * The interface creates the structure of a range of integers.
 * to determine if a specific value falls within the range, if there is an overlap
 * 
 */
public interface Range {

    /**
     * Checks if asked value is in the range
     *
     * @param value the integer value to check.
     * @return {@code true} if the value is within the range; {@code false}.
     */
    boolean contains(int value);

    /**
     * checks if there is an overlap between the ranges.
     *
     * @param other the other range to check for overlap.
     * @return {@code true} if there is at least one common element between the two ranges;
     *         {@code false} otherwise.
     */
    boolean overlaps(Range other);

    /**
     * Calculates the size of the range
     * 
     *
     * @return the size of the range as an integer.
     */
    int size();
}



	



