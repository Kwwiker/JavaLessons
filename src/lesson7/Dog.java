package lesson7;

public class Dog extends Pet {
    public Dog(int speed, int weight, String color) {
        super(speed, weight, color);
    }

    @Override
    String talk() {
        return "GAV-GAV";
    }
}
