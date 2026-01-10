package arrays;

public class SlidingWindow {
	public static void solution(int[] arr, int k) {
		int cSum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i =0; i < arr.length; i++) {
			if(i < k) {
				cSum += arr[i];
				
				max = cSum;
			}else {
				cSum = (cSum - arr[i - k]) + arr[i];
				max = Math.max(max, cSum);
			}
		}
		
		
		System.out.print(max);
	}
}
