package arrays;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = {1, 2, 8, 17};
		Arrays.sort(ar1);
//		System.out.println(SearchingAlg.binarySearch(arr, 56));
//		System.out.println(arr[SearchingAlg.binarySearch(arr, 56)]);
		
//		System.out.println(SimpleProblems.getSpan(arr));
		
		
//		System.out.println(SimpleProblems.secondSmallest(arr));
		
		
		
		// Bitonic Array Search 
		
		int[] ar2 = {5, 6, 7, 19, 21, 25};
//		System.out.println(BitonicArray.searchElement(bitonicArray, 50));
		
		
		
//		System.out.println(SearchingAlg.countEqualOrLowerNumbers(arr, 77));
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(SearchingAlg.getFirstAndLastIndex(arr, 77)));
//		int[] rotatedArray = new int[100];
//		for(int i =0; i < rotatedArray.length; i++) {
//			rotatedArray[i] = i+1;
//		}
//		long curTime = System.currentTimeMillis();
//		
//		System.out.println(RotatedArrayProblem.search(rotatedArray, 101));
//		System.out.println(System.currentTimeMillis() - curTime);
		
		
		
		System.out.print(TwoArrays.getMedian(ar1, ar2));
	}

}
