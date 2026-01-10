package arrays;

public class Consecutive01array {
	public static void flipMinimumCosecutive(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[0]) {
				arr[i] = arr[0];
			}
		}
	}
	
	public static void groupMinimumConsecutiveElements(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				if(arr[i] != arr[0]) {
					System.out.print(i + " - ");
				}else {
					System.out.println(i - 1);
					
				}
			}
		}
		
		if(arr[0] != arr[arr.length-1]) {
			System.out.println(arr.length-1);
		}
	}
}
