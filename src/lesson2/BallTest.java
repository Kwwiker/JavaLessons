package lesson2;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball(1.0, 2.0);
        Ball b2 = new Ball();
        b1.setXY(2.0, 3.0);
        b2.setY(2.0);
        b2.move(5.0, 6.0);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
