package Recursion;

public class JosephusProblem {

	public static int solution(int n , int k) {
		if(n == 1) {
			return 0;
		}
		
		
		int res = (solution(n-1, k) + k) % n;
		return res;
		
	}
}
