package arrays;

public class RotateArray {
	public void solution(int[] arr) {

		int temp = arr[0];
		for(int i = 1; i < arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length - 1] = temp;
	}
	
	
	public void solution(int[] arr, int n) {
		if(n == 0 || n == arr.length) {
			return;
		}
		if(n < 0) {
			n = (arr.length + n) % arr.length;
		}else {
			n = n % arr.length;
		}
		
		for(int i = 1; i <= n; i++) {
			solution(arr);
		}
		
	}
	
	private void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	void solution2(int[] arr, int num){
		if(arr.length == 0 || num == 0) return;
		
		
		num = num % arr.length;
		if(num < 0) {
			num = arr.length + num;
		}
		
		reverse(arr, 0, num -1);
		reverse(arr, num, arr.length -1);
		reverse(arr, 0, arr.length - 1);
	}
}
