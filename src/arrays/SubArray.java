package arrays;

public class SubArray {
	void printSubArraySolution(int[] arr){
		for(int i= 0; i < arr.length; i++) {
			for(int j  = i; j < arr.length; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}
