package Chapter11;

public class ThreadExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker());
        Thread t2 = new Thread(new Worker());

        t1.start();
        t2.start();
        System.out.println("All threads have started");
    }
}
