package string;

import java.util.LinkedList;
import java.util.List;

public class FizzBizz {

	public static List<String> solution(int n){
		List<String> l = new LinkedList<String>();
		
		for(int i =1; i <= n; i++) {
			if(i % 15 == 0) {
				l.add("FizzBizz");
			}else if(i % 3 == 0) {
				l.add("Fizz");
			}else if(i % 5 == 0) {
				l.add("Bizz");
			}else {
				l.add(i+"");
			}
		}
		
		return l;
	}
	
	
}
