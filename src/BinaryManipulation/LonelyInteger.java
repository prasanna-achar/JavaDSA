package BinaryManipulation;

public class LonelyInteger {
	public static int findLonelyInteger(int[] arr) {
		int res =0;
		
		/*
		 * 
		 *  a ^ b ^ c ^ d = d ^ b ^ a ^ c
		 *  It doesn't matter order whichever the unique value in array get returned
		 * 
		 * */
		
		
		for(int i : arr) {
//			System.out.print(res +"^" + i);
			res = res ^ i;
//			System.out.println(": "+res +" ");
		}
//		System.out.println();
		return res;
	}
}
