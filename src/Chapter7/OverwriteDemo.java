package Chapter7;

public class OverwriteDemo {

    public static void main(String[] args) {
        Parent test = new Children();
        test.overrideMe();
    }
}

class Parent {

    void overrideMe () {
        System.out.println("Something wrong");
    }
}

class Children extends Parent {

    @Override
    void overrideMe() {
        System.out.println("OK");
    }
}