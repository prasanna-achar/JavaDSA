package BinaryManipulation;

public class Consecutive {

	public static boolean isConsecutive(int n){
		return !((n & ((n-1) << 1)) == 0);
	}
	
	
	public static int countConsecutiveOnes(int n) {
		
		int count = 0;
		while(n != 0 ) {
			n =n & (n << 1);
			count++;
		}
		return count;
	}
}
