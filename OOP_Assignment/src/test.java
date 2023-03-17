import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
	
	@Test
	void test() {
		int a =3;
		int b =4;
		int c2= a*a +b*b;
		int c=MyMath.sqrt(c2);
		assertEquals(25,c);
	}
	
	@Test
	void test2() {
		int[] elems= {12,24,45};
		assertEquals(false,MyMath.IsSorted(elems));
	}
	
	
}
