public class MyMath {
	
/**
 * INFORMAL DOCUMENTATION: Returns the square root of the given number rounded down
 * FORMAL DOCUMENTATION: 
 * 
 * Contractual programming vs Defensive programming.
 * @throws The number is non negative.
 *       |0 <=x
 * @post The result equals the ....
 * 		 | 0 <=result &&
 * 		 | result*result <=x &&
 *       | x<(result+1)*(result+1)
 */
	static int sqrt(int x) {
		if (x<0) 
			throw new IllegalArgumentException("x is negative!"); //Defensive programming	
		int r=0;
		while((r+1)*(r+1) <=x)
			r++;
		return x;
	}
/**
 * 	
 * @throws |elements=null
 * @post 
 * 		|result == Instream.range(1, elements.length).allMatch(i -> elements[i-1] <= elements[i])
 */
		
	static boolean IsSorted(int[] elements) {
		if (elements==null) 
			throw new IllegalArgumentException("elements is null");
		for (int i=1; i<elements.length; i++)
			if (elements[i-1]>elements[i])
				return false;
		return true;
	}
	
/**
 * @pre  | elements!=null
 * @post | Intstream.range(1, elements.length).allMatch(i -> elements[i] == -old(elements.clone())[i])
 */	
	static void negateElement(int[] elements) {
		for(int i=0; i<elements.length; i++)
			elements[i]=-elements[i];
	}

/**
 * Insert value v into 0 and n into an array
 * @pre  |
 * @post |
 */
	static void insert(int[] elements, int n, int v) {
		
	}

}


