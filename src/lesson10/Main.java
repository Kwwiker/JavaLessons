package lesson10;

public class Main {
    public static void main(String[] args) {
        Object LOCK_OBJECT = new Object();
        MyThread ping = new MyThread(LOCK_OBJECT, "Ping!");
        MyThread pong = new MyThread(LOCK_OBJECT, "Pong!");
        ping.start();
        pong.start();
    }
}
