package lesson5;

public class QuickSort {
    public static void main(String[] args) {
        User[] array = {new User("Kirill", 18), new User("Alex", 19), new User("Boris", 23), new User("Pavel", 18), new User("Nikita", 20)};
        for (int i =0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        quickSort(array, 0, array.length-1);
        for (int i =0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(User[] array, int left, int right) {
        int leftMark = left;
        int rightMark = right;
        User pivot = array[(leftMark + rightMark) / 2];

        do {
            while (array[leftMark].compareTo(pivot) < 0) { //array[leftMark] < pivot
                leftMark++;
            }
            while (array[rightMark].compareTo(pivot) > 0) { //array[rightMark] > pivot
                rightMark--;
            }
            if (leftMark <= rightMark) {
                if (leftMark < rightMark) {
                    User tmp = array[leftMark];
                    array[leftMark] = array[rightMark];
                    array[rightMark] = tmp;
                }
                leftMark++;
                rightMark--;
            }
        } while (leftMark <= rightMark);

        if (leftMark < right) {
            quickSort(array, leftMark, right);
        }
        if (left < rightMark) {
            quickSort(array, left, rightMark);
        }
    }
}
