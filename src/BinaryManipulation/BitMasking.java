package BinaryManipulation;

public class BitMasking {
	
	
	
	public static int SwitchOn(int value, int i) {
		int mask = 1 << i;
		return value | mask;
	}
	
	
	public static int SwitchOff(int value, int i) {
		int mask = ~(1 << i);
		return value & mask;
	}
	
	public static int Toggle(int value, int i) {
		int mask = 1 << i;
		return value ^ mask;
	}
	
	
	public static String checkOn(int value , int i) {
		int mask = 1 << i;
		int res = value & mask;
		return ""+i+" : "+ (res == 0 ?"OFF":"ON");
	}
}
