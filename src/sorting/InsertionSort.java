package sorting;

public class InsertionSort {
	
	
	
	public void solution(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
}
