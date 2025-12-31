package arrays;

public class MaximumSubArray {
	public int solution(int[] arr) {
		int res  =0;
		
		for(int size = arr.length; size >= 1; size--) {
			for(int i = 0; i <= arr.length-size; i++) {
				int sum = 0;
				for(int j = i; j < i + size; j++) {
					sum += arr[j];
				}
				if(sum > res) {
					res = sum;
				}
			}
		}
		
		
		return res;
	}
	
	
	public int kadaneSolution(int[] arr) {
		int sum = arr[0];
		int maxSum  = arr[0];
		for(int i  =1; i < arr.length; i++) {
			if(sum >= 0) {
				sum += arr[i];
			}else {
				sum = arr[i];
			}
			
			if(sum > maxSum) {
				maxSum = sum;
			}
		}
		
		
		return maxSum;
	}
}
