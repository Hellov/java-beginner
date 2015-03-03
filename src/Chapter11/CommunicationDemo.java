package Chapter11;

public class CommunicationDemo {

    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick", tt);
        MyThread mt2 = new MyThread("Tock", tt);

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}

class TickTock {

    String state;

    synchronized void tick (boolean running) throws InterruptedException {
        if (!running) {
            state = "ticket";
            notify();
            return;
        }

        System.out.print("Tick ");

        Thread.sleep(500);
        state = "ticket";
        notify();

        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }


    synchronized void tock (boolean running) throws InterruptedException {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        Thread.sleep(500);
        state = "tocked";
        notify();

        try {
            while (!state.equals("ticket")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class MyThread implements Runnable {

    Thread thread;
    TickTock tickTock;

    MyThread(String name, TickTock tt) {
        thread = new Thread(this, name);
        tickTock = tt;
        thread.start();
    }

    @Override
    public void run() {
        try {
            if (thread.getName().compareTo("Tick") == 0) {
                for (int i = 0; i < 10; i++) tickTock.tick(true);
                tickTock.tick(false);
            } else {
                for (int i = 0; i < 10; i++) tickTock.tock(true);
                tickTock.tock(false);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }

}

