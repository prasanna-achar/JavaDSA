package arrays;

import java.util.Arrays;

public class SearchingAlg {
	public static int linearSearching(int[] arr, int key) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
			
		}
		return -1;
	}
	
	private static int binarySearch(int[] arr, int start, int mid, int end, int key) {

		
		if(start <= end) {
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] > key) {
				return binarySearch(arr, mid, (mid+ end)/ 2, end,key);
			}else {
				return binarySearch(arr, start, (start + mid)/ 2, mid,key);
				
			}
		}
		
		return -1;
		
	}
	
	
	public static int binarySearch(int[] arr, int key) {
		int[] org = arr;
		Arrays.sort(org);
		return binarySearch(org, 0,(arr.length - 1) /2, arr.length-1, key);
	}
}
