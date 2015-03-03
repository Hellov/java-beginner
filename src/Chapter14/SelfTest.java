package Chapter14;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class SelfTest {

    public static void main(String[] args) {

        Predicate<Integer> between = n -> (n >= 10 && n <= 20);

        System.out.println(between.test(10));
        System.out.println(between.test(11));
        System.out.println(between.test(9));
        System.out.println(between.test(20));
        System.out.println(between.test(21));
        System.out.println();

        UnaryOperator<String> removeSpace = (str) -> {
            String result = "";
            int length = str.length();
            while(length-- > 0) {
                if (str.charAt(length) != ' ') {
                    result = str.charAt(length) + result;
                }
            }

            return result;
        };

        System.out.println(removeSpace.apply("Hello World from Russia!"));
    }
}