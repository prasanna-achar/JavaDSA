package Recursion;

public class Problems {
	public static void printBalancedParanthesis(char[] arr, int n, int i, int o, int c) {
		if(i == arr.length) {
			System.out.println(arr);
		}
		
		if(o < n) {
			arr[i] = '(';
			printBalancedParanthesis(arr, n, i+1, o+1, c);
		}
		if(c < o) {
			arr[i] = ')';
			printBalancedParanthesis(arr, n, i+1, o, c+1);
		}
	}
	
	public static int findPower(int num , int power) {
		if(power == 0) {
			return 1;
		}
		
		if(( power & 1) != 0) {
			return findPower(num, power -1) * num;
		}else {
			int res = findPower(num , power / 2);
			return res * res;
		}
	}
	
	
	
	public static void printSubSequencesOfString(String s, String ans) {
		if(s.isEmpty()) {
			System.out.println(ans);
			return;
		}
		printSubSequencesOfString(s.substring(1), ans + s.charAt(0));
		printSubSequencesOfString(s.substring(1), ans);
	}
	
	
	public static void towerOfHanoi(int n, String src, String aux, String dest) {
	if(n == 1) {
		System.out.println(src +" ->> "+dest);
		return;
	}
	
	towerOfHanoi(n-1, src, dest, aux);
	towerOfHanoi(1, src, aux, dest);
	towerOfHanoi(n-1, aux, src, dest);
	
	}
	
	
	public static boolean checkLuckyNumber(int n) {
		return checkLuckyNumber(n, 2);
	}
	private static boolean checkLuckyNumber(int n, int counter) {
		if(n % counter == 0) {
			return false;
		}
		if(counter > n) {
			return true;
		}
		return checkLuckyNumber(n-(n/counter), counter+1);
	}
	
	
	public static int ropeCutting(int n, int a , int b, int c) {
		if(n == 0) {
			return 0;
		}
		else if(n < 0) {
			return -1;
		}
		
		int temp1 = ropeCutting(n-a, a, b, c);
		int temp2 = ropeCutting(n-b, a, b, c);
		int temp3 = ropeCutting(n-c, a, b, c);
		
		int pieces = Math.max(Math.max(temp1,  temp2), temp3);
		
		return pieces == -1? -1: pieces+1;
	}
	
	public static void printPermutationStrings(char[] arr, int fi) {
		if(fi == arr.length-1) {
			System.out.println(arr);
			return;
		}
		
		for(int i =fi; i < arr.length; i++) {
			swap(arr, i, fi);
			printPermutationStrings(arr, fi +1);
			swap(arr, i, fi);
			
		}
		
	}
	
	public static void swap(char[] arr, int i, int fi) {
		// TODO Auto-generated method stub
		
		var temp = arr[i];
		arr[i] = arr[fi];
		arr[fi] = temp;
		
	}


	public static void printPermutationStrings(String s) {
		printPermutationStrings(s.toCharArray(), 0);
	}
}
