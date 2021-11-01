package lesson2;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 3;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Круг. Площадь="+getArea()+" Периметр="+getPerimeter();
    }
}
