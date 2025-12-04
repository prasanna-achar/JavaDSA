package BinaryManipulation;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		// NOTE: It is binary to String 
//		int n = scan.nextInt();
//		
//		String b = Convertion.convertToBinary(n);
//		System.out.println(b);
//		
//		System.out.println("Numeric: "+ Convertion.convertToNumeric(b));
//		System.out.println(Convertion.convertToBinary(10.000f));
//		System.out.println(Convertion.convertToDecimal( Convertion.convertToBinary(10.000f)));
//		System.out.println(~88);
		 
		 
		 
		 // Note: It is Bit Masking
//		 int value = scan.nextInt();
//		 int i = scan.nextInt();
//		 System.out.println(BitMasking.SwitchOn(value, i));
//		 System.out.println(BitMasking.SwitchOff(value, i));
//		 for(int j = 0; j < 4; j++) {
//			 value = BitMasking.Toggle(value, i);
//			 System.out.println(value);
//		 }
//		System.out.println(BitMasking.checkOn(value, i));
		
		
		
		// Note: Right set Bit
//		 int value = scan.nextInt();
//		 System.out.println(RSMB.findFirstRightSet(value));
//		 System.out.println(RSMB.numberOfRightSetBit(value));
		 
		
//		
//		int value = scan.nextInt();
//		
//		System.out.println(Power.powerOf2(value));
//		System.out.println(Power.powerOf4(value));
		
		
		
		// Lonely Integer
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.println(LonelyInteger.findLonelyInteger(arr));
		
		
		// Note: Finding Max And pair in an array
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.println(AndOperation.MaxAndPairs(arr));
		
		
		
		// Note: Reversing the Bits 
		
		int num = scan.nextInt();
		
//		System.out.println(ReverseBits.reverse(num));
		
		
		
		//Note: Trailing zeros
//		System.out.println(TrailingZeroInBits.trailingZero(num));
		
		
		// Note : Swap bits
//		System.out.println(SwapBits.swapOddEvenPos(num));
		
		
		//Note: Consecutive ones
//		System.out.println(Consecutive.countConsecutiveOnes(num));
		
		
		
		System.out.println(NthBinaryPalindromeValue.findNthPalindromeNumber(num));
	 }
}
