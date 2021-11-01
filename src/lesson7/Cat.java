package lesson7;

public class Cat extends Pet {
    public Cat(int speed, int weight, String color) {
        super(speed, weight, color);
    }

    @Override
    String talk() {
        return "MEOW-MEOW";
    }
}
