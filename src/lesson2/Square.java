package lesson2;

public class Square extends Rectangle {

    public Square() {
        this.length = 5;
        this.width = 5;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Квадрат. Площадь="+getArea()+" Периметр="+getPerimeter();
    }
}
