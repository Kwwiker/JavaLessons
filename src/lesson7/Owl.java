package lesson7;

public class Owl extends Pet{
    public Owl(int speed, int weight, String color) {
        super(speed, weight, color);
    }

    @Override
    String talk() {
        return "UHUU-UHUU";
    }
}
