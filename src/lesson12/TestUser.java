package lesson12;

public class TestUser {
    public static void main(String[] args) throws StudentNotFoundException {
        User[] array = {new User("Kirill", 18), new User("Alex", 19), new User("Boris", 23), new User("Pavel", 18), new User("Nikita", 20)};
        System.out.println(findUser(array, "fofof").toString());
    }
    
    public static User findUser(User[] arr, String name) throws StudentNotFoundException{
        User u = null;
        for (int i=0; i< arr.length; i++) {
            if (arr[i].name == name) {
                u = arr[i];
                break;
            }
        }
        if (u == null) {
            throw new StudentNotFoundException("Student Not Found!");
        }
        return u;
    }
}
