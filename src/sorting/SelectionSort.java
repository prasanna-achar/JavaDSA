package sorting;

public class SelectionSort {
	public void solution(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int si = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[si] > arr[j]) {
					si = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[si];
			arr[si] = temp;
		}
	}
	
	public void experiment(int[] arr) {
		int i = 0, j = arr.length - 1;
		
		while(i <= j) {
			int si = i;
			int bi = i;
			for(int k = i + 1; k <= j; k++) {
				if(arr[si] > arr[k]) {
					si = k;
				}
				if(arr[bi] < arr[k]) {
					bi = k;
				}
			}
			
			int tempS = arr[si];
			arr[si] = arr[i];
			arr[i] = tempS;
			
			int tempB = arr[bi];
			arr[bi] = arr[j];
			arr[j] = tempB;
			i++;
			j--;
		}
	}
}
