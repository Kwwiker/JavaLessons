package lesson1;

import lesson1.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, "Black");
        Ball b2 = new Ball(3);
        Ball b3 = new Ball("Grey");
        Ball b4 = new Ball();
        b4.setColor("Pink");
        b4.setRadius(12);
        System.out.println(b3);
        System.out.println(b4);
        b1.getArea();
        b2.getVolume();
    }
}
