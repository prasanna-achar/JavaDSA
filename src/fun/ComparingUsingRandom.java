package fun;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@FunctionalInterface
interface Sum{
	int sum(int a, int b);
}

public class ComparingUsingRandom {
	public static void main(String[] args) {
		Set<Integer> l = new TreeSet<Integer>((a, b) -> b - a);
		Comparator.reverseOrder();
		l.add(45);
		l.add(15);
		l.add(23);
		l.add(57);
		l.add(86);
		Integer[] arr = l.stream()
				.map(num -> num - num/2)
				.filter(num -> 	num % 2 == 0)			
				.toArray(Integer[] :: new);
		Arrays.sort(arr, (a, b)-> a - b);
		System.out.println(l);
		System.out.println(Arrays.toString(arr));
		 
		
		/*
		 * Before implementing it, things to learn to understand what is going in these lines:
		 * 1. Collection 
		 * 2. Set and TreeSet
		 * 3. Functional Interface and interface
		 * 4. lambda expression
		 * 5. Comparable  and Comparator
		 * 6. difference between compareTo and compare methods
		 * 7. Lexicographic comparison (For reference)
		 * 
		 * */
//		Collections.sort(l, (a, b) -> {
//			return b-a;
//		});
//		
//		System.out.println(l.stream().map((num) -> num * num).toList());
	}
}
