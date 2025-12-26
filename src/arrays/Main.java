package arrays;

import java.util.Arrays;

public class Main {
	
//	private static void test(int[] arr) {
//        int[] result = SimpleProblems.findRepeatingAndMissing(arr);
//        System.out.println(Arrays.toString(arr) + " -> " +
//                           Arrays.toString(result));
//    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ar1 = {1, 2, 8, 17};
//		Arrays.sort(ar1);
//		System.out.println(SearchingAlg.binarySearch(arr, 56));
//		System.out.println(arr[SearchingAlg.binarySearch(arr, 56)]);
		
//		System.out.println(SimpleProblems.getSpan(arr));
		
		
//		System.out.println(SimpleProblems.secondSmallest(arr));
		
//		sum(3, 5);
//		sum(3L, 5L);
//		sum(3, 6L);
		
		// Bitonic Array Search 
		
//		int[] ar2 = {5, 6, 7,4 ,23, 19, 21, 25};
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
		
		
		
//		System.out.print(TwoArrays.getMedian(ar1, ar2));
//		RotatedArrayProblem.printAscendingAndDescending(ar2);
		
//		test(new int[]{1, 2, 2, 4, 5});        // [2, 3]
//        test(new int[]{1, 3, 3});              // [3, 2]
//        test(new int[]{4, 3, 6, 2, 1, 1});      // [1, 5]
//        test(new int[]{2, 2});                 // [2, 1]
//        test(new int[]{1, 1, 2, 3, 4});         // [1, 5]
//        test(new int[]{5, 3, 4, 2, 5, 1});      // [5, 6]
//        test(new int[]{3, 1, 3, 4, 5, 6, 7});   // [3, 2]
//        test(new int[]{6, 1, 2, 3, 4, 6});      // [6, 5]
//        test(new int[]{1, 2, 3, 4, 4});         // [4, 5]
//        test(new int[]{7, 3, 4, 5, 5, 6, 1});   // [5, 2]
		
		
//		System.out.println(PaintersPartition.solution(new int[] {10, 20, 30, 40}, 2, 2));
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(arr));
		new RotateArray().solution2(arr, 2);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
