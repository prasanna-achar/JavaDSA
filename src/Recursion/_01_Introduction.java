package Recursion;

public class _01_Introduction {
	static void fun(int n) {
		if(n == 0) return ;
		System.out.println(n);
		fun(n-1);
	}
}
