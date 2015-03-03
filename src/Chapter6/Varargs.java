package Chapter6;

public class Varargs {

    public static void main(String[] args) {
        test(-5, 3, 5, 1);
        test();
        test(1);
    }

    static void test (int ... v) {

        System.out.printf("Arguments length is: %d\n", v.length);

        for (int i: v) {
            System.out.println(i);
        }
        System.out.println();
    }
}
