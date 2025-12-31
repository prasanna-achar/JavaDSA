package arrays;

public class TrapWaterProblem {
	
	
	//Time complexity:: O(n^2)
	//Space complexity:: O(1)
	void solution1(int[] arr) {
		long t  = System.currentTimeMillis();
		System.out.println(t);
		int res  =0 ;
		
		for(int i = 1; i < arr.length -1 ;i++) {
			int lb = arr[i];
			int rb = arr[i];
			for(int j = 0; j < i; j++) {
				if(arr[j] >= lb) {
					lb = arr[j];
				}
			}
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] >= lb) {
					rb = arr[j];
				}
			}
			int min = lb > rb ? rb : lb;
			
			res += (min - arr[i]);
		}
		
		System.out.println(res);
		System.out.println(System.currentTimeMillis() );
	}
	
	
	

	//Time complexity:: O(n)
	//Space complexity:: O(n^3)
	void solution2(int[] arr){
		int[] lb = new int[arr.length];
		int[] rb = new int[arr.length];
		lb[0] = arr[ 0];
		for(int i = 1; i < arr.length; i++) {
			if(lb[i-1] < arr[i]) {
				lb[i] = arr[i];
			}else {
				lb[i] = lb[i-1];
			}
		}
		rb[arr.length-1] = arr[arr.length-1];
		for(int i = arr.length -2; i >= 0; i--) {
			if(arr[i] > rb[i+1]) {
				rb[i] = arr[i];
			}else {
				rb[i] = rb[i+1];
			}
		}
		int res = 0;
		for(int i = 1; i < arr.length-1; i++) {
			int min = rb[i] < lb[i] ? rb[i] : lb[i];
			res += (min - arr[i]);
		}
		System.out.println(res);
	}
	
	void solution3(int[] arr) {
		int l = 0; int r = arr.length-1;
		int lhb = arr[l]; int rhb = arr[r];
		int res = 0;
		while(l <= r) {
			if(lhb <= rhb) {
				if(arr[l] >= lhb) {
					lhb = arr[l];
				}else {
					res += (lhb - arr[l]);
				}
				l++;
			}else {
				if(arr[r] >= rhb) {
					rhb = arr[r];
				}else {
					res += (rhb - arr[r]);
				}
				r--;
			}
			
		}
		System.out.println("result: " + res);
	}
}
