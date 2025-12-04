package BinaryManipulation;

public class SwapBits {
	public static int swapOddEvenPos(int num) {
		return ((num & 0xAAAAAAAA)>>> 1) | ((num & 0x55555555)<< 1);
	}
}
