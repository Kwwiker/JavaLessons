package lesson1;

public class Ball {
    private int radius;
    private String color;

    public Ball(int r, String c) {
        radius = r;
        color = c;
    }

    public Ball(int r) {
        radius = r;
        color = "Light Red";
    }

    public Ball(String c) {
        radius = 5;
        color = c;
    }

    public Ball() {
        radius = 2;
        color = "Green";
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "It's a " + getColor() + " ball with radius " + getRadius();
    }

    public void getArea() {
        System.out.println("Area of a " + getColor() + " ball with radius " + getRadius() + " is " + 4 * Math.PI * Math.pow(getRadius(), 2));
    }

    public void getVolume() {
        System.out.println("Volume of a " + getColor() + " ball with radius " + getRadius() + " is " + 4 * Math.PI * Math.pow(getRadius(), 3) / 3);
    }
}
