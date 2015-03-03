package Chapter7;

public class ConstructorOrder {

    public static void main(String[] args) {
        A test = new B();
    }
}

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("B");
    }
}