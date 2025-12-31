package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleProblems {

	private static int max(int[] arr) {
		int max = arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	private static int min(int[] arr) {
		int min = arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int getSpan(int[] arr) {
		return max(arr) - min(arr);
	}
	
	
	
	public static int secondLargest(int[] arr) {
		if(arr.length == 2) {
			return arr[0] > arr[1] ? arr[1] : arr[0];
		}
		if(arr.length == 1) {
			return  arr[0];
		}
		
		int max1, max2;
		if(arr[0] > arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		}else {
			max1 = arr[1];
			max2 = arr[0];
			
		}
		
		for(int i =2; i < arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		
		return max2;
	}
	
	
	public static int secondSmallest(int[] arr) {
		if(arr.length == 2) {
			return arr[0] < arr[1] ? arr[1] : arr[0];
		}
		if(arr.length == 1) {
			return  arr[0];
		}
		
		int max1, max2;
		if(arr[0] < arr[1]) {
			max1 = arr[0];
			max2 = arr[1];
		}else {
			max1 = arr[1];
			max2 = arr[0];
			
		}
		
		for(int i =2; i < arr.length; i++) {
			if(arr[i] < max1) {
				max2 = max1;
				max1 = arr[i];
			}else if(arr[i] < max2) {
				max2 = arr[i];
			}
		}
		
		return max2;
	}
	public static int[] findRepeatingAndMissing(int[] arr) {

		int n = arr.length;
		
		long SN = (n * (n + 1)) / 2;
		long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
		
		long S = 0, S2 = 0;
		for(int x : arr) {
			S += x;
			S2 += (x * (long)x);
		}
		
		long eq1 = SN - S; // x - y
		long eq2 = S2N - S2;   // (x - y)(x + y) = x^2 - y^2
		eq2 = eq2 / eq1;
		
		
		long missing = (eq1 + eq2) / 2;
		long repeating = eq2 - missing;
		/* 
		 * Even though we got x - y = value1 we can't find x and y value with one equation so square of values
		 * x^2 - y^2 = value2 we got and we can further simplify it like
		 * (x - y)(x + y)   ::::: (x - y)(x + y) = x^2 - y^2
		 * the above equation can also mention as
		 * value1 * ( x + y ) = value2
		 * x + y = value2 / value1 // let's assume value3
		 * 
		 * now we have
		 * x-y = value1
		 * x+y = value3
		 * 
		 * Sum the equation
		 * 
		 * 2x = value (value1 + value3)
		 * x = value / 2;  and it is the repeating value
		 * 
		 * find y 
		 * x + y = value1
		 * y = value1 - x;
		 * 
		 * */
		
		
		return new int[] {(int)repeating , (int)missing};
		
		
	}
	
	
	public static int sqrt(int value) {
		int l = 0;
		int h = value / 2;
		int res = -1;
		while(l <= h) {
			int mid = (l + h) / 2;
			if((mid * mid) == value) {
				return mid;
			}else if((mid * mid) < value) {
				res = mid;
				l = mid + 1;
			}else {
				h = mid - 1;
			}
		}
		return res;
	}
	
	
	public static void removeDuplicates1(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i+1]) {
				al.add(arr[i]);
			}
				
		}
		if(arr[arr.length-1] == arr[arr.length-2]) {
			al.add(arr[arr.length-1]);
		}
		
		
		arr = al.stream().mapToInt(Integer :: intValue).toArray();
	}
	public static void removeDuplicates2(int[] arr) {
		
		
		int rd = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i -1]) {
				rd++;
				arr[rd] = arr[i];
			}
		}
		arr = Arrays.copyOf(arr, rd + 1);
		Math.sqrt(4);
	}
	
	
	public static void inverseArray(int[] arr) {
		int[] inverseArr = new int[arr.length];
		for(int i =0; i < arr.length; i++) {
			inverseArr[arr[i]] = i;
		}
		System.out.println(Arrays.toString(inverseArr));
	}
	
	
	public static int MaximumConsecutiveOnes(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		
		int res = 0;
		int count = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}else {
				if(count > res) {
					res = count;
				}
				count = 0;
			}
		}
		return res;
	}
}
