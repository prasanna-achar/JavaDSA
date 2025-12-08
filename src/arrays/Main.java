package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 65 , 22, 11, 77, 56, 87, 101};
		Arrays.sort(arr);
		System.out.println(SearchingAlg.binarySearch(arr, 56));
		System.out.println(arr[SearchingAlg.binarySearch(arr, 56)]);
	}

}
