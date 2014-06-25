package example2;

import java.util.List;

import common.ListMaker;

/**
 * Shows adding numbers the java 8 way.
 * 
 * @author Dan Wiechert
 */
public class Java8 {
	public static void main(final String[] args) {
		final List<Integer> numbers = ListMaker.createNumbers();
		
		final int sum = numbers.stream().reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum);
	}
}
