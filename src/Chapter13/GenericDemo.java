package Chapter13;

public class GenericDemo {

    public static void main(String[] args) {

        Gen iOb = new Gen<Integer>(1);
        iOb.showType();

        iOb = new Gen<String>("Test");
        iOb.showType();

        GenExt<Double, Double> extOb = new GenExt <> (2.0);
        extOb.show();

        Counter task = new Counter("Test");
    }

    static <T extends Comparable<T>, V extends T> boolean test(T ob, V ob2) {
        return false;
    }
}

interface GenTest<T> {

}

class Gen<T> implements GenTest<T> {

    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of OB is: " + ob.getClass().getName());
    }
}

class GenExt<T extends Number, V extends T> {

    T ob;

    GenExt(T ob) {
        this.ob = ob;
    }

    void show() {
        System.out.println(ob.getClass().getName());
    }
}

class TaskScheduler<T extends Runnable, V extends T> {

    TaskScheduler(T ob1, V ob2) {

    }
}

class Counter<T> {

    Counter(T ob) {

    }
}