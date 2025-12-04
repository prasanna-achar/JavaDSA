package BinaryManipulation;

public class Power {
	public static boolean powerOf2(int n) {
		return (n != 0) && ((n & (n-1)) == 0);
	}
	
	
	public static boolean powerOf4(int value) {
		return (value != 0) && ((value-1) % 3 == 0) && ((value & (value-1)) == 0);
	}
	
//	public static int TwoPowerOf(byte power) {
//		return 1 << power;
//	}
//	public static long TwoPowerOf(int power) {
//		return 1L << power;
//	}
	
	public static boolean powerOf3(int num) {	
		return num > 0 && 1162261467 % num == 0;
	}
}
