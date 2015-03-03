package Chapter14;

public class LambdaDemo {

    public static void main(String[] args) {

        LambdaTest myLambda = n -> n * 99.8;

        System.out.println(myLambda.getValue(2));
    }
}

interface LambdaTest {
    double getValue(int n);
}