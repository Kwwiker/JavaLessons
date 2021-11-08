package lesson10;

public class MyThread extends Thread implements Runnable {
    private Object LOCK;
    private String name;

    public MyThread(Object LOCK, String name) {
        this.LOCK = LOCK;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            while(true) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                LOCK.notify();
                try {
                    LOCK.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

