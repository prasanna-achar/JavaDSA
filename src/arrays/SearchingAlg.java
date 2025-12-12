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
	
	
	public static int ceil(int[] arr, int target) {
		Arrays.sort(arr);
		return findCeil(arr, 0, arr.length-1, target);
	}

	private static int findCeil(int[] arr, int l, int r, int target) {
		// TODO Auto-generated method stub
		if(l > r) {
			return l < arr.length ? arr[l] : -1;
		}
		int m = (l + r) / 2;
		
		if(arr[m] == target) {
			return arr[m];
		}else if(arr[m] < target) {
			return findCeil(arr, m+1, r, target);
		}else {
			return findCeil(arr, l, m-1, target);
			
		}
		
	}
	
	
	
	public static int floor(int[] arr, int target) {
		return findFloor(arr, 0, arr.length-1, target);
	}

	private static int findFloor(int[] arr, int l, int r, int target) {
		// TODO Auto-generated method stub
		if(l > r) {
			return r >= 0 ? arr[r] : -1;
		}
		int m = (l + r) / 2;
		
		if(arr[m] == target) {
			return arr[m];
		}
		else if(arr[m] < target) {
			return findFloor(arr, m+1, r, target);
		}else {
			return findFloor(arr, l, m -1, target);
		}
	
	}
	
	
	
	private static int binraySearchForEqualOrLowerNumbersCount(int[] arr, int l, int r, int target) {
		if(l > r) {
			return r >= 0 ? r : -1;
		}
		
		int m = (l + r) / 2;
		
		if(arr[m] == target) {
			return m;
		}else if(arr[m] < target) {
			return binraySearchForEqualOrLowerNumbersCount(arr, m+1, r, target);
		}else {
			return binraySearchForEqualOrLowerNumbersCount(arr, l, m-1, target);			
		}
	}
	
	
	public static int countEqualOrLowerNumbers(int[] arr, int target) {
		int pos = binraySearchForEqualOrLowerNumbersCount(arr, 0, arr.length-1, target);
		if( pos == -1) {
			return 0;
		}if(arr[pos] != target) {
			return pos;
		}
		while(pos + 1 < arr.length && arr[pos + 1] == target) {
			pos++;
		}
		return pos+1;
	}
	
	
	private static void getFirstIndex(int[] arr, int l, int r, int target, int[] positions) {
		if(l > r) {
			return;
		}
		int m = (l + r) / 2;
		if(arr[m] == target) {
			positions[0] = m;
			getFirstIndex(arr, l, m -1, target, positions);
		}else if(arr[m] < target) {
			getFirstIndex(arr, m+1, r, target, positions);		
		}else {
			getFirstIndex(arr, l, m -1, target, positions);
		}
	
	}
	
	
	private static void getLastIndex(int[] arr,int l, int r, int target, int[] positions) {
		if(l > r) {
			return;
		}
		int m = (l + r) / 2;
		if(arr[m] == target) {
			positions[1] = m;
			getLastIndex(arr, m+1, r, target, positions);
		}else if(arr[m] < target) {
			getLastIndex(arr, m+1, r, target, positions);		
		}else {
			getLastIndex(arr, l, m -1, target, positions);
		}
	}
	
	
	public static void getFirstIndex(int[] arr, int target, int[] positions) {
		 getFirstIndex(arr, 0, arr.length-1, target,positions);
	}
	public static void getLastIndex(int[] arr, int target, int[] positions) {
		getLastIndex(arr, 0, arr.length-1, target, positions);
	}
	
	public static int[] getFirstAndLastIndex(int[] arr, int target) {
		int[] positions = {-1, -1};
		getFirstIndex(arr, target, positions);
		getLastIndex(arr, target, positions);
		return positions;
	}
}
