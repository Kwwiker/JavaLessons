package lesson8;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffelDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i=1; i<=100;i++) {
            lottery.add(i);
        }

        Collections.shuffle(lottery);
        System.out.println("Первые 10 чисел:");
        for (int i=0;i<10;i++) {
            System.out.println(lottery.get(i));
        }
    }
}
