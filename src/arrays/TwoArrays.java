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
	
	
	
	public static float getMedian(int[] ar1, int[] ar2) {
		int[] pa = ar1.length > ar2.length ? ar1 : ar2;
		int[] sa = ar1.length < ar2.length ? ar1 : ar2;
	
		int l = 0;
		int h = sa.length;
	
		while(l < h) {
			int m1 = (l + h) / 2;
			int m2 = ((sa.length + pa.length + 1) / 2 ) - m1;
			
			int l1 = m1 != 0 ? sa[m1-1] : Integer.MIN_VALUE;
			int l2 = m2 != 0 ? pa[m2-1] : Integer.MIN_VALUE;
			int r1 = m1 < sa.length ? sa[m1] : Integer.MAX_VALUE;
			int r2 = m2 < pa.length ? pa[m2] : Integer.MAX_VALUE;
			
			if(l1 <= r2 && l2 <= r1) {
				if((ar1.length + ar2.length) % 2 == 0) {
					return (float)(Integer.max(l1, l2) + Integer.min(r1, r2) ) / 2;
				}else {
					return Integer.max(l1, l2);
				}
				
			}else if(l2 > r1){
				l = m1 +1;
			}else {
				h = m1-1;
			}
		}
		
		return 0;
	}
}
