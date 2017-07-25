package notify_all;

public class WaitNotifyClass extends Thread{
    private final Object mon = new Object();
    private volatile char currentLetter= 'A';
//    private final char getCurrentLetter = 'C';

    public static void main(String[] args) {
        WaitNotifyClass w = new WaitNotifyClass();
        Thread t1 = new Thread(() -> {
            w.printA();
        });

        Thread t2 = new Thread(() -> {
            w.printC();
        });
        Thread t3 = new Thread(() -> {
            w.printC();
        });
        t1.start();
        t2.start();
        t3.start();

    }
    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 4; i++) {
                    while (currentLetter != 'A')
                        mon.wait();
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 4; i++) {
                    while (currentLetter != 'B')
                        mon.wait();
                    System.out.print("B");
                    currentLetter = 'C';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 4; i++) {
                    while (currentLetter != 'B')
                        mon.wait();
                    System.out.print("B");
                    currentLetter = 'A';
                    mon.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


