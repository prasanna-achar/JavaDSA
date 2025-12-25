package arrays;

import java.util.Arrays;

public class PaintersPartition {

	/*
	 Given 2 integers A and B and an array of integars C of size N.
	  Element C[i] represents length of ith board.

	You have to paint all N boards[CO, C1, C2, C3 ... CN-1].
	 There are A painters available and each of them
	  takes B units of time to paint 1 unit of board.

	Calculate and return minimum time required to paint all boards 
	under the constraints that any painter will only paint contiguous sections of board.
	

	•2 painters cannot share a board to paint. 
	That is to say, a boardcannot be painted partially by one painter, 
	and partially by another.

	• A painter will only paint contiguous boards. 
	Which means a configuration where painter 1 paints board 1 and 3 but not 2 
	is invalid.

	Return the ans % 10000003
	  
	  */
	
	
	private static boolean isPossible(int[] arr, int totalPainters, int unitLimit) {
		int currPainterNumber = 1;
		int currentBoardUnitSum = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] > unitLimit) {
				return false;
			}
			if(currentBoardUnitSum + arr[i] <= unitLimit) {
				currentBoardUnitSum += arr[i];
				
			}else {
				currPainterNumber++;
				if(currPainterNumber > totalPainters) {
					return false;
				}
				currentBoardUnitSum = arr[i];
			}
		}
		return true;
	}
	
	
	
	public static int solution(int[] arr, int totalPainters, int timeToCompleteSingleUnit) {
		if(arr.length < 1 || totalPainters < 1) {
			return 0;
		}
		
		if(arr.length == 1) {
			return arr[0];
		}
		
		
		int l =0;
		int r = Arrays.stream(arr).sum();
		int res = 0;
		while(l <= r) {
			int m = (l + r) / 2;
			if(isPossible(arr, totalPainters, m)) {
				res = m;
				r = m - 1;
			}else {
				l = m + 1;
			}
		}
		return res * timeToCompleteSingleUnit;
	}
	
}
