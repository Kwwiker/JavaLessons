package lesson12;

public class User implements Comparable<User> {
    String name;
    Integer age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "User(" + name + " " + age + ")";
    }
}
