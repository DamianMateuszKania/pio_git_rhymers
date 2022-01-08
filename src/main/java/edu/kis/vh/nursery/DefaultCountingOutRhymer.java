package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int RHYMER_CAPACITY = 12;
	private static final int BASE_ELEMENT_COUNT = -1;
	private static final int NO_VALUES = -1;

	private final int[] numbers = new int[RHYMER_CAPACITY];

	private int total = BASE_ELEMENT_COUNT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int getTotal() {
		return total;
	}

	public boolean callCheck() {
		return total == BASE_ELEMENT_COUNT;
	}

	public boolean isFull() {
		return total == RHYMER_CAPACITY - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return NO_VALUES;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return NO_VALUES;
		return numbers[total--];
	}

}
