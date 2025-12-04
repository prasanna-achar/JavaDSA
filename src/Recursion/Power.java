package Recursion;

public class Power {
	public static int powerOf(int n, int power) {
		if(power == 0) {
			return 1;
		}
		
		return n * powerOf(n, power-1);
	}
}
