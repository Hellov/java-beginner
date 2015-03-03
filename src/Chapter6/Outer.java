package Chapter6;

public class Outer {

    private int[] nums;

    Outer (int[] n) {
        nums = n;
    }

    void analyze () {
        Inner innerClass = new Inner();

        System.out.printf("Minimal number is: %d\n", innerClass.min());
        System.out.printf("Maximal number is: %d\n", innerClass.max());
        System.out.printf("Average number is: %f\n", innerClass.avg());
    }

    class Inner {

        int min () {
            int min = nums[0];

            for (int num: nums) {
                if (num < min) {
                    min = num;
                }
            }

            return min;
        }

        int max () {
            int max = nums[0];

            for (int num: nums) {
                if (num > max) {
                    max = num;
                }
            }

            return max;
        }

        float avg () {
            int sum = 0;

            for (int num: nums) {
                sum += num;
            }

            return (float) sum/nums.length;
        }
    }
}
