package BinaryManipulation;

public class TrailingZeroInBits {

	
	public static int trailingZero(int num) {
//		if(num % 2 != 0) return 0;
		return (int)(Math.log10(num ^(num & (num -1)))/ Math.log10(2));
	}
	
}
