package arrays;

import java.util.Arrays;
import java.util.Collections;

public class RotatedArrayProblem {
	
	 
	  
	
	private static int getPivotIndex(int[] arr, int l, int r) {
//		System.out.println("L: "+l+" R:"+r);
		if(l > r) {
			return 0;
		}
		int m = ( l + r )/ 2;
		if(arr[m] < arr[m+1] && (m > 0 && arr[m] < arr[m-1])) {
			return m;
		}else if(arr[m] > arr[r]) {
			return getPivotIndex(arr, m+1, r);
		}else {
			return getPivotIndex(arr, l, m-1);
		}
	}
	
	public static int getPivotIndex(int[] arr) {
		return getPivotIndex(arr, 0, arr.length-1);
	}
	
	
	public static int binarySearch(int[] arr,int l, int r, int target) {
		if(l > r) {
			return -1;
		}
		
		int m = (l + r) / 2;
		
		if(arr[m] == target) {
			return m;
		}else if(arr[m] < target) {
			return binarySearch(arr, m+1, r, target);
		}else {
			return binarySearch(arr, l, m-1, target);
			
		}
	}
	
	
	public static int search(int[] arr, int target) {
		int pivot = getPivotIndex(arr);
		System.out.println("Pivot index: "+ pivot);
		int l , r;
		if( pivot != 0 && (target >= arr[0] && target <= arr[pivot-1])) {
//			return binarySearch(arr, 0, pivot-1, target);
			l = 0; r= pivot -1;
			
			while(l <= r) {
				int m = (l + r) /2;
				if(arr[m] == target) {
					return m;
				}else if(target > arr[m]) {
					l = m+1;
				}else {
					r = m-1;
				}
			}
			
			}else {
				l = pivot; r= arr.length-1;
				
				while(l <= r) {
					int m = (l + r) /2;
					if(arr[m] == target) {
						return m;
					}else if(target > arr[m]) {
						l = m+1;
					}else {
						r = m-1;
					}
				}
		}
		return -1;

	}
	
	public static void printAscedingAndDescending(Integer[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void printAscendingAndDescending(int[] arr) {

	    // Ascending
	    int[] asc = Arrays.stream(arr).sorted().toArray();
	    System.out.println(Arrays.toString(asc));

	    // Descending
	    int[] desc = Arrays.stream(arr)
	                       .boxed()
	                       .sorted((a, b) -> b - a)
	                       .mapToInt(Integer::intValue)
	                       .toArray();
	    System.out.println(Arrays.toString(desc));
	}
}
