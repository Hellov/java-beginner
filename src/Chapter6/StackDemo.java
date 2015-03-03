package Chapter6;

public class StackDemo {

    public static void main(String[] args) {
        Stack test = new Stack(5);

        for (int i = 1; i<=5; i++) {
            test.push(i);
        }
        System.out.println();

        for (int i = 1; i<=5; i++) {
            System.out.println(test.pop());
        }
    }

    static class Stack {
        private int[] numbers;
        private int current = 0;
        private int maximum;

        Stack(int size) {
            numbers = new int[size];
            maximum = size;
        }

        void push (int num) {
            if (current == maximum) {
                System.out.println("Stack overload");
                return;
            }
            numbers[current++] = num;
        }

        int pop () {

            if (current == 0) {
                System.out.println("Stack empty");
                return 0;
            }
            return numbers[--current];
        }
    }
}
