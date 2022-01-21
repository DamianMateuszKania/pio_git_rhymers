package edu.kis.vh.nursery;

/**
 Stack implementation for Rhymer
 */

public class DefaultCountingOutRhymer {

	private static final int RHYMER_CAPACITY = 12;
	private static final int BASE_ELEMENT_COUNT = -1;
	private static final int NO_VALUES = -1;

	private final int[] numbers = new int[RHYMER_CAPACITY];

	private int total = BASE_ELEMENT_COUNT;

	/***
	 * add new elements
	 * @param in value of new elements
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/***
	 *
	 * @return return nubmer of elements
	 */
	public int getTotal() {
		return total;
	}

	/***
	 *
	 * @return return True if table is empty and False if is not.
	 */
	public boolean callCheck() {
		return total == BASE_ELEMENT_COUNT;
	}

	/***
	 *
	 * @return return True if Rhymer is full and False if Rhymer is not full
	 */
	public boolean isFull() {
		return total == RHYMER_CAPACITY - 1;
	}

	/***
	 *
	 * @return return last element
	 */
	protected int peekaboo() {
		if (callCheck())
			return NO_VALUES;
		return numbers[total];
	}

	/***
	 *
	 * @return return last element and delete it
	 */
	public int countOut() {
		if (callCheck())
			return NO_VALUES;
		return numbers[total--];
	}

}
