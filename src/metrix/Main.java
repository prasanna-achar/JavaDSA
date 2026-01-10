package metrix;

public class Main {
	public static void main(String[] args) {
		int[][] met = new int[5][5];
		int count = 1;
		for(int i = 0; i < met.length; i++) {
			for(int j = 0; j < met[i].length; j++) {
				met[i][j] = count++;
			}
		}
		
		
//		for(int i = 0; i < met.length; i++) {
//			for(int j = 0; j < met[i].length; j++) {
//				System.out.print(met[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < met.length; i++) {
//			System.out.println(met[0][i]);
//		}
//		
//		for(int i = 1; i < met[0].length; i++)
//			System.out.println(met[i][met[i].length-1]);
//		
//		for(int j = met[met.length-1].length - 2; j >= 0; j-- ) {
//			System.out.println(met[met.length-1][j]);
//			
//		}
//		
//		for(int i = met.length-2; i >= 1; i--) {
//			System.out.println(met[i][0]);
//			
//		}
		
		for(int i =0; i < met.length; i++) {
			for(int j =0; j < met[i].length;j++) {
				if(i == 0 || i == met.length-1 || j == 0 || j == met[i].length-1) {
					if(met[i][j] < 10) {
						System.out.print("0");
					}
					System.out.print(met[i][j] +" ");
				}else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}
}
