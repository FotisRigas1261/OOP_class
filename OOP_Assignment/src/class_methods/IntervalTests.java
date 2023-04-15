package class_methods;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	@Test
	void test() {
		Interval length1 = new Interval(5, 7);
		Interval length2 = new Interval(12, 15);

		Interval totalLength = length1.plus(length2);

		assertEquals(17, totalLength.getLowerBound());
		assertEquals(5, totalLength.getLength());
		assertEquals(22, totalLength.getUpperBound());
	}

}
