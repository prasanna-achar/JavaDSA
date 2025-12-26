package arrays;

public class MoveZerosToEnd {
	void solution(int[] arr) {
		int n = arr.length-1;
		int nz = arr.length-1;
		while(nz >= 0) {
			if(arr[nz] != 0) {
				int t = arr[nz];
				arr[nz] = arr[n];
				arr[n--] = t;
			}
			nz--;
		}
		
		
	}
}
