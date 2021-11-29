package lesson12;

public class MergeSort {
    public static void main(String[] args) {
        User[] array = {new User("Kirill", 18), new User("Alex", 19), new User("Boris", 23), new User("Pavel", 18), new User("Nikita", 20)};
        for (int i =0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        mergeSort(array, 0, array.length - 1);
        for (int i =0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void merge(User array[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        User L[] = new User[n1];
        User R[] = new User[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) { //L[i] <= R[j]
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(User arr[], int l, int r)
    {
        if (l < r) {
            int m =(l+r)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}
