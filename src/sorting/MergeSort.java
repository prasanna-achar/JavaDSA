package sorting;

public class MergeSort {
	
	void solution(int[] arr) {
		solution(arr, arr.length);
	}
	
	void solution(int[] arr, int n){
		devide(arr, 0, n -1);
	}
	
	private void devide(int[] arr, int low, int high) {
		if(low == high) {
			return;
		}
		
		int mid = (low + high) / 2;
		
		devide(arr, low, mid);
		devide(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}
	
	
	private void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // copy back
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
