package lesson5;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User("s", 3);
        User u2 = new User("e", 4);
        System.out.println(u2.compareTo(u1));
    }
}
