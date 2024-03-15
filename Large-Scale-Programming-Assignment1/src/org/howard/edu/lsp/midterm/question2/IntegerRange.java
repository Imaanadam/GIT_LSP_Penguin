
package org.howard.edu.lsp.midterm.question2;

/**
 * Shows a range of integers and creates the Range interface.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     * @param lowerBound the smallest int in range
     * @param upperBound the largest int in range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Overrides the Object equals method that compares a range objects based on bounds.
     * @param the object to compare with this range
     * @return true if the object is also a range
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange other = (IntegerRange) obj;
        return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
    }

}
