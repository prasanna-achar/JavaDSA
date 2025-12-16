package arrays;

import java.util.Arrays;

public class TwoArrays {
	
	private static int[] mergeSortedArr(int[] ar1, int[] ar2) {
		int m = ((ar1.length + ar2.length) / 2) + 1;
		int[] mergedArr = new int[m];
		int i= 0, j =0 , k = 0;
		while(i < ar1.length && j < ar2.length && k < m) {
			if(ar1[i] < ar2[j]) {
				mergedArr[k++] = ar1[i++];
			}else {
				mergedArr[k++] = ar2[j++];
				
			}
		}
		
		while(i < ar1.length && k < m) {
			mergedArr[k++] = ar1[i++];			
		}
		while(j < ar2.length && k < m) {
			mergedArr[k++] = ar2[j++];			
		}
		return mergedArr;
	}
	
	public static int findMedian(int[] ar1, int[] ar2) {
		int[] mergedArr = mergeSortedArr(ar1, ar2);
		System.out.println(Arrays.toString(mergedArr));
		if((ar1.length + ar2.length) % 2 != 0 ) {
			return mergedArr[mergedArr.length-1];
		}else {
			return (mergedArr[mergedArr.length-1] + mergedArr[mergedArr.length-2]) / 2;
		}
	}
}
