package BinaryManipulation;

public class NthBinaryPalindromeValue {

	
	private static int powerOf2(int n) {
		return 1 << n;
	}
	
	
	private static int reverseBits(int num, int length) {
		int i =0, j = length;
		int res = 0;
		while(i < j) {
			if(((1 << j) & num)!= 0) {
				res = res | (1 <<i);
			}
			if((num & (1 << i)) != 0) {
				res = res | (1 << j);
			}
			i++;
			j--;
		}
		
		return res;
	}
	
	static int findNthPalindromeNumber(int n) {
		int count = 0;
		int length = 0;
		
		while(count < n) {
			length++;
			count += powerOf2((length-1)/2);
		}
		count -= powerOf2((length-1)/2);
		
		int res = 1 << length-1;
		res = res | (n - count - 1 << (length / 2));
		
		int rev = reverseBits(res, length-1);
		
		return res | rev;
	}
	
}
