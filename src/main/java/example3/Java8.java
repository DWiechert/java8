package example3;

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

        // We're calling reduce over the list with an initial value of 0 and then add '+' the rest of the numbers.
        final int sum = numbers.stream().reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sum);
    }
}
