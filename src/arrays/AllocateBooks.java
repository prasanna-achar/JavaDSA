package arrays;

import java.util.Arrays;

public class AllocateBooks {
	
	
	
	private static boolean isPossible(int[] arr, int studentCount, int pageLimit) {
		int studentNumber = 1;
		int currentPageCount = 0;
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > pageLimit) {
				return false;
			}
			if(currentPageCount + arr[i] <= pageLimit) {
				currentPageCount += arr[i];
			}else {
				studentNumber++;
				if(studentNumber > studentCount) {
					return false;
				}
				currentPageCount = arr[i];
			}
		}
		return true;
	}
	
	public static int solution(int[] arr, int studentCount) {
		if(arr.length < studentCount) {
			return -1;
		}
		if(arr.length == studentCount) {
			return Arrays.stream(arr).max().getAsInt();
		}
		int l = Arrays.stream(arr).min().getAsInt();
		int r = Arrays.stream(arr).sum();
		int res = -1;
		while(l <= r) {
			int mid = ( l + r) / 2;
			if(isPossible(arr, studentCount, mid)) {
				res = mid;
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return l;
	}
}
