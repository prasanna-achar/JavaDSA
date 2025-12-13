package arrays;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 65 , 22, 11,77 , 77, 77, 56, 87, 101};
		Arrays.sort(arr);
//		System.out.println(SearchingAlg.binarySearch(arr, 56));
//		System.out.println(arr[SearchingAlg.binarySearch(arr, 56)]);
		
//		System.out.println(SimpleProblems.getSpan(arr));
		
		
//		System.out.println(SimpleProblems.secondSmallest(arr));
		
		
		
		// Bitonic Array Search 
		
//		int[] bitonicArray = {10, 20, 30, 40, 60, 50, 30, 20, 10};
//		System.out.println(BitonicArray.searchElement(bitonicArray, 50));
		
		
		
//		System.out.println(SearchingAlg.countEqualOrLowerNumbers(arr, 77));
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(SearchingAlg.getFirstAndLastIndex(arr, 77)));
		
		long curTime = System.currentTimeMillis();
		
		int[] rotatedArray = {5, 4, 6, 7, 8, 1, 2, 3};
		Arrays.sort(rotatedArray);
		System.out.println(RotatedArrayProblem.search(rotatedArray, 3));
		System.out.println(System.currentTimeMillis() - curTime);
	}

}
