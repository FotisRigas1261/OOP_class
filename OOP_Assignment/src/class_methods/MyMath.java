package class_methods;
public class MyMath {
	//All of these are PROCEDURAL ABSTRACTIONS
/**
 * INFORMAL DOCUMENTATION: Returns the square root of the given number rounded down
 * FORMAL DOCUMENTATION: 
 * 
 * Contractual programming vs Defensive programming.
 * @throws IllegalArgumentException The number is non negative!
 *       |0 < x  (this tells when i throw, is the exact oposite of @post)
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
	 * (in documentation no loops are writen, only Intstream)
	 * What the above means: We have a stream of integers, Intsrteam. in this, starting from integer in pos. 1,
	 * we go to position at the end. Then all these have to match to the following. i-> ??
	 * Result == is needed.
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
	 * 
	 * old is used to compare with previous input
	 * elements.clone could be elements[i], but not allowed
	 */	
	static void negateElement(int[] elements) {    //sth wrong here
		for(int i=0; i<elements.length; i++)
			elements[i]=-elements[i];
	}

	/**
	 * Insert value v into an array between 0 and n 
	 * @pre  | array!=null
	 * @pre  | 0 <=n
	 * @pre  | n<array.length
	 * @pre  | IntStream.range(1,n).allMatch(i->array[i-1]<=array[i])
	 * 
	 * @post The elements between 0 and n must be sorted
	 * 		 | IntStream.range(1,n).allMatch(i->array[i-1] <= array[i])
	 * @post  The elements between index 0 and n are in ascending order
	 * 		 | IntStream.range(1,n+1).allMatch(1->array[i-1]<=array[i])
	 * @post The elements between index 0 and n are preserved, v is inserted
	 * 		 | IntStream.range(0, n+1).allMatch(
 	 *       | IntStream.range(0,n+1).filter(j->old(array.clone())[j]==array[i]).count()==
 	 *       | IntStream.range(0,n).filter(j->old(array.clone())[j]==array[i]).count()+
 	 *       | (array[i]==v? 1:0))
 	 *       | )
 	 * 
 	 * C? A:B means if C then A otherwise B
 	 */
	
	static void insert(int[] array, int n, int v) {
		int i=0;
		while (i<n && array[i] < v) 
			i++;
		for (int j=n-1; i<=j; j--)  //this has to be done from the back, else the array will be overwriten
			array[j+1]=array[j];
		array[i]=v;
	}
	
	//Documentation for checking the array is same length as before
	/**
	 * @throws IllegalArgumentException | array==null
	 * 
	 * @post The elements in the array should be in ascending order
	 *     | IntStream.range(1,array.length).allMatch(i -> array[i-1] <= array[i])
	 * @post No elements are lost from array, occurencies remain same
	 * 	   | Intstream.range(0, array.length).allMatch(i->
	 * 	   |	Intstream.range(0, array.length).filter(j->array[j] == array[i]).count()==
	 *     |    Intstream.range(0, array.length).filter(j-> old(array.clone())[j] == array[i]).count()
	 *     | )
	 */
	static void insertionSort(int[] array) {
		if (array==null)
			throw new IllegalArgumentException("Array is null");
		for (int n=1; n<array.length; n++)
			insert(array, n, array[n]);  //insert is found above
		
	}

}

