package lesson10;

public class Main {
    public static void main(String[] args) {
        Object LOCK = new Object();
        MyThread ping = new MyThread(LOCK, "Ping!");
        MyThread pong = new MyThread(LOCK, "Pong!");
        ping.start();
        pong.start();
    }
}
