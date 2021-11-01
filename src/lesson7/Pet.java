package lesson7;

public class Pet {
    int speed;
    int weight;
    String color;

    public Pet(int speed, int weight, String color) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    String talk() {
        return "AAAAAAAAAAAA";
    }

    void sleep() {

    }

    @Override
    public String toString() {
        return "Type = " + getClass().getSimpleName() + "\tSpeed = " + this.speed + "\tWeight = " + this.weight + "\tColor = " + this.color;
    }
}
