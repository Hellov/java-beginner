package Chapter6;

public class NestedClassDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 11, 99, -5, 7};

        Outer outerClass = new Outer(nums);

        outerClass.analyze();

        Testing test = new Testing();
        System.out.println(test);
    }

    static class Testing {


        @Override
        public String toString() {
            return "Testing{}";
        }
    }
}
