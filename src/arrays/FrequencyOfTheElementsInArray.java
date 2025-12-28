package arrays;

import java.io.Console;

public class FrequencyOfTheElementsInArray {

	
	public FrequencyOfTheElementsInArray() {}
	
	
	void solution(int [] arr) {
		Console c = System.console();
		if (c == null) {
            System.out.println("Console not available. Run from terminal.");
            return;
        }
		String s = c.readLine("write A number");
		c.printf(s);
		int freq =1;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] == arr[i]) {
				freq++;
			}else {
				c.format("Element: %d, Frequency: %d \n", arr[i-1] , freq);
				freq = 1;
			}
		}
	}
	
}
