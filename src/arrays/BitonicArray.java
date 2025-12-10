package arrays;

public class BitonicArray {
	public static int searchElement(int[] arr, int target) {
		int bitonicIndex = findBitonicIndex(arr);
		System.out.println("Bitonic Index : "+ bitonicIndex+" Bitonic element: "+ arr[bitonicIndex]);
		int search = ascendingOrderSearch(arr, 0, bitonicIndex, target);
		if(search == -1) {
			search = descenidingOrderSearch(arr, bitonicIndex, arr.length-1, target);
		}
		
		return search;
	}

	
	private static int descenidingOrderSearch(int[] arr,int l, int r, int target) {
		int m = l + (r -l) / 2;
		if(l > r) {
			return -1;
		}
		if(arr[m] == target) {
			return m;		
		}else if(arr[m] < target) {
			return descenidingOrderSearch(arr, l, m-1, target);
		}else {			
			return descenidingOrderSearch(arr, m+1, r, target);
		}

	}
	
	private static int ascendingOrderSearch(int[] arr, int l, int r, int target) {
		if(l > r) {
			return -1;
		}
		int m = l + (r-l)/ 2;
		if(arr[m] == target) {
			return m;		
		}else if(arr[m] > target) {
			return ascendingOrderSearch(arr, l, m-1, target);
		}else {			
			return ascendingOrderSearch(arr, m + 1, r, target);
		}

	}
	
	
	private static int findBitonicIndex(int[] arr) {
		
		return findBitonicIndex(arr, 0, arr.length-1);
	}

	private static int findBitonicIndex(int[] arr, int l, int r) {
		int m = (l + r) / 2;
		if(l > r) {
			return -1;
		}
		if(arr[m] > arr[m-1] && arr[m] > arr[m+1]) {
			return m;
		}else if(arr[m] > arr[m-1] && arr[m] < arr[m+1]) {
			return findBitonicIndex(arr, m, r);
		}
		else {
			return findBitonicIndex(arr, l, m);
			
		}
	}
}
