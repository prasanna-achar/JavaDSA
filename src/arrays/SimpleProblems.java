package arrays;

public class SimpleProblems {

	private static int max(int[] arr) {
		int max = arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	private static int min(int[] arr) {
		int min = arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int getSpan(int[] arr) {
		return max(arr) - min(arr);
	}
	
	
	
	public static int secondLargest(int[] arr) {
		if(arr.length == 2) {
			return arr[0] > arr[1] ? arr[1] : arr[0];
		}
		if(arr.length == 1) {
			return  arr[0];
		}
		
		int max1, max2;
		if(arr[0] > arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		}else {
			max1 = arr[1];
			max2 = arr[0];
			
		}
		
		for(int i =2; i < arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		
		return max2;
	}
	
	
	public static int secondSmallest(int[] arr) {
		if(arr.length == 2) {
			return arr[0] < arr[1] ? arr[1] : arr[0];
		}
		if(arr.length == 1) {
			return  arr[0];
		}
		
		int max1, max2;
		if(arr[0] < arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		}else {
			max1 = arr[1];
			max2 = arr[0];
			
		}
		
		for(int i =2; i < arr.length; i++) {
			if(arr[i] < max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] < max2) {
				max2 = arr[i];
			}
		}
		
		return max2;
	}
}
