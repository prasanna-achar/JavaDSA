package arrays;

import java.util.Arrays;

public class MinimumDayMakeMBonquet {
	
	
	
	public static int solution(int[] bloomDay, int m, int k) {
		if(m * k > bloomDay.length) {
			return -1;
		}
	
		
		int h = Arrays.stream(bloomDay).max().getAsInt();
		int l = Arrays.stream(bloomDay).min().getAsInt();
		
		int res = -1;
		while(l <= h) {
			int mid = (l + h) / 2;
			if(isPossible(bloomDay, m, k, mid)) {
				res = mid;
				h = m -1;
			}else {
				l = m + 1;
			}
		}
		return res;
	}

	private static boolean isPossible(int[] bloomDay, int bonquetNumber, int flowers, int day) {
		// TODO Auto-generated method stub
		int adj = 0;
		int bonqueCount = 0;
		
		for(int i =0; i < bloomDay.length; i++) {
			if(bloomDay[i] <= day) {
				adj++;
				if(adj == flowers) {
					bonqueCount++;
					adj =0;
					if(bonqueCount == bonquetNumber) {
						return true;
					}
				}
			}else {
				adj = 0;
			}
		}
		
		
		return true;
	}
	
}
