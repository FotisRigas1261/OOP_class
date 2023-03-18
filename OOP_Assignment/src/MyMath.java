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
 * Insert value v into an array between 0 and n 
 * @pre  | array!=null
 * @pre  | 0 <=n
 * @post The elements between 0 and n must be sorted
 * 		 | IntStream.range(1,n).allMatch(i->array[i-1] <= array[i])
 * 
 * @post  The elements between index 0 and n are in ascending order
 * 		 |IntStream.range(1,n+1).allMatch(1->array[i-1]<=array[i])
 * @post The elements between index 0 and n are preserved, v is inserted
 *       | IntStream.range(0,n+1).filter(j->old(array.clone())[j]==array[i]).count()+
 *        (array[i]==v? 1:0))
 *        
 * C? A:B means if C then A otherwise B
 */
	static void insert(int[] array, int n, int v) {
		int i=0;
		while (i<n && array[i] < v) {
			i++;
		for (int j=n-1; i<=j; j++)
			array[j+1]=array[j];
		array[i]=v;
		}
	}
}


