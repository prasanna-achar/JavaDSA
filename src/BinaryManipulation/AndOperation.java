package BinaryManipulation;

public class AndOperation {

	
	public static boolean checkBits(int[] arr , int mask) {
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			if((arr[i] & mask) == mask) {
				count++;
			}
		}
		return count > 1;
	}
	
	public static int MaxAndPairs(int[] arr) {
		int mask = 0;
		int res = 0;
		for(int i = 31; i >=0 ; i--) {
			mask = (1 << i) | res;
			if(checkBits(arr, mask)) {
				res = res | mask;
			}
		}
		return res;
	}
}
