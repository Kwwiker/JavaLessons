package lesson12;

public class InsertionSort {
    public static void main(String[] args) {
        User[] array = {new User("Kirill", 18), new User("Alex", 19), new User("Boris", 23), new User("Pavel", 18), new User("Nikita", 20)};
        for (int i =0; i < array.length; i ++) {
            System.out.print(array[i].toString() + " ");
        }
        System.out.println();
        insertionSort(array);
        for (int i =0; i < array.length; i ++) {
            System.out.print(array[i].toString() + " ");
        }
    }

    public static void insertionSort(User[] array) {
        for (int cur = 0; cur < array.length; cur++) {
            User x = array[cur];
            int i;
            for (i = cur - 1; i >= 0; i--) {
                if (x.compareTo(array[i]) < 0) { //x < array[i]
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = x;
        }
    }
}
