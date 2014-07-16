package example3;

import java.util.List;

import common.ListMaker;

/**
 * Shows adding numbers the java 7 way.
 *
 * @author Dan Wiechert
 */
public class Java7 {
    public static void main(final String[] args) {
        final List<Integer> numbers = ListMaker.createNumbers();
        int sum = 0;
        for (final Integer number : numbers) {
            sum += number.intValue();
        }
        System.out.println(sum);
    }
}
