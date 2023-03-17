public class MyMath {
	
/**
 * INFORMAL DOCUMENTATION: Returns the square root of the given number rounded down
 * FORMAL DOCUMENTATION: 
 * 
 * Contractual programming vs Defensive programming.
 * @pre The number is non negative.
 *       |0 <=x
 * @post The result equals the ....
 * 		 | 0 <=result &&
 * 		 | result*result <=x &&
 *       | x<(result+1)*(result+1)
 */
	static int sqrt(int x) {
		int r=0;
		while((r+1)*(r+1) <=x)
			r++;
		return x;
	}
}
