package sorting;

import java.util.Arrays;

public class Main {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3, 5, 1, 6, 7, 2};
		
		new InsertionSort().solution(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
