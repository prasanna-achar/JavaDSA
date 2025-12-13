package arrays;

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
		
		if( pivot != 0 && (target >= arr[0] && target <= arr[pivot-1])) {
			return binarySearch(arr, 0, pivot-1, target);
		}else {
			return binarySearch(arr, pivot, arr.length-1, target);
		}
		
	}
}
