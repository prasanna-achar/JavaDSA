package PatternProgramming;


public class Problems {

	public static void printPattern1(int n) {
		
		
		/*
		 * 
		 		*****
		 		*****
		 		*****
		 		*****
		 		*****
		 */
		
		for(int i =1; i <= n; i++) {
			for(int j =1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
//	*
//	**
//	***
//	****
//	*****
	public static void printPattern2(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	
	public static void printPattern3(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
	}
	public static void printPattern4(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);				
			}
			System.out.println();
		}
	}
	public static void printPattern5(int n) {
		for(int i =n; i >= 1; i--) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
	
	public static void printPattern6(int n) {
		for(int i =n; i >= 1; i--) {
			
			for(int j = 1; j <=i; j++) {
				System.out.print(j);				
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void printPattern7(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			for(int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printPattern8(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			for(int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printPattern9(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			for(int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n; i >= 1; i--) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");				
			}
			for(int j = 1; j <= (i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printPattern10(int n) {
		for(int i =1; i < n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void printPattern11(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((i+j) % 2 == 0? 1 : 0);
			}
			System.out.println();
		}
	}
	
	public static void printPattern12(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = i; j >=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	public static void printPattern13(int n) {
		int count =1;
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(((count < 10) ? "0" :"") +count +" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void printPattern14(int n) {
		for(int i =1; i <= n; i++){
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64));
			}
			System.out.println();
		}
	}
	
	public static void printPattern15(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}
	}
	
	public static void printPattern16(int n) {
		for(int i =n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}
	}
	
	public static void printPattern17(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64));
			}
			for(int j = i; j > 1; j--) {
				System.out.print((char) (j + 63));
			}
			System.out.println();
		}
	}
	
	public static void printPattern18(int n) {
		for(int i =1; i <= n; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print((char) (65 +n - j));
			}
			System.out.println();
		}
	}
}
