package lesson11;

public class Horse extends Thread {
    @Override
    public void run() {
        System.out.println("Финишировала лошадь под номером: " + (1+Integer.parseInt(getName().split("-")[1])));
    }
}
