package Chapter11;

public class Worker implements Runnable {
    @Override
    public void run() {
        int i = 10;
        do {
            System.out.println(i);
            i--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (i > 0);
    }
}
