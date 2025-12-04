package BinaryManipulation;

public class ReverseBits {

	
	public static int reverse(int num) {
		int start =0;
		int end = 31;
		int rev = 0;
		while(end > start) {
			if((num & (1 << start)) != 0) {
				rev = rev | (1 << end);
			}
			if((num & (1 << end)) != 0) {
				rev = rev | (1 <<start);
			}
			
			start++;
			end--;
			
		}
		
		return rev;
	}
	
}
