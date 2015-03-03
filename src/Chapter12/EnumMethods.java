package Chapter12;

public class EnumMethods {

    @TestAnnotation (str="Test", val=100)
    public static void main(String[] args) {

        Example var = Example.THREE;

        System.out.println(var.ordinal());
    }
}

enum Example {
    ONE, TWO, THREE
}

@interface TestAnnotation {
    String str();
    int val();
}