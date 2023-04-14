import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMath_test {
	
	@Test
	void test1() {
		int a =3;
		int b =4;
		int c2= a*a +b*b;
		int c=MyMath.sqrt(c2);
		assertEquals(25,c);
	}
	
	@Test
	void test2() {
		int[] elems= {12,24,45};
		assertEquals(true,MyMath.IsSorted(elems));
		assertThrows(IllegalArgumentException.class, ()-> MyMath.IsSorted(null)); 
	}
	
	@Test
	void test3() {
		int[] elems= {11,23,24};
		MyMath.negateElement(elems);
		assertEquals(new int[] {-11,-23,-24}, elems);
	}
	
	@Test
	void test4() {
		int[] elems= {10,20,30,5,7,3};
		MyMath.insert(elems,3,15);
		assertArrayEquals(new int[] {10,15,20,30,7,3}, elems);
		MyMath.insert(elems,4,35);
		assertArrayEquals(new int[] {10,15,20,30,35,3}, elems); //It should be right
	}
	
	@Test
	void test5() {
		int[] elems= {12,3,4,6};
		MyMath.insertionSort(elems);
		assertArrayEquals(new int[] {3,4,6,12}, elems);
	}
}
