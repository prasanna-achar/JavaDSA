package BinaryManipulation;

public class RSMB {
	
	
	// Note : >>> Not efficient
//	public static int findFirstRightSet(int value) {
//		String b ="";
//		
//		while(value > 0) {
//			b = (value % 2) +b;
//			value /= 2;
//		}
//		
//		for(int i = b.length()-1; i >= 0; i--) {
//			if(b.charAt(i) == '1') {
//				return (b.length() - (i+1))+1;
//			}
//		}
//		return -1;
//	}
	
	
	
//	Note : >>> Efficient
//	public static int findFirstRightSet(int value) {
//		if(value % 2 != 0) return 1;
//		if(value == 0) return -1;
//		
//		int pos =1;
//		int mask = 2;
//		
//		while((value & mask) == 0) {
//			pos++;
//			mask = mask <<1;
//		}
//		return pos +1;
//	}
	
//	Note: Most Efficient
	public static int findFirstRightSet(int n) {
		return (int)(Math.log10(n ^ (n &(n-1))) / Math.log10(2)) +1;
	}
	
	public static int numberOfRightSetBit(int value) {

		int count =0;
		while(value != 0) {
		
			value = value & (value -1);
			count++;
		}
		
		return count;
	}
}
