package lesson7;

import java.util.HashMap;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Pet> pets = new HashMap();
        pets.put("Bobik", new Dog(30, 10,"Black"));
        pets.put("Matroskin", new Cat(25, 5, "White"));
        pets.put("Noname", new Owl(25, 7, "Brown"));
        for (String key: pets.keySet()) {
            System.out.println("Name(key) = "+key+"\t"+pets.get(key).toString());
        }
        pets.put("Alex", new Dog(35, 12, "Grey"));
        pets.put("Murzik", new Cat(22, 7, "Orange"));
        System.out.println();
        for (String key: pets.keySet()) {
            System.out.println("Name(key) = "+key+"\t"+pets.get(key).toString());
        }
        System.out.println();
        HashMap<Integer, Integer> rhm = new HashMap<>();
        Random rand = new Random();
        for (int i=0; i<100; i++) {
            int newRand = rand.nextInt(10);
            if (rhm.containsKey(newRand)) {
                rhm.put(newRand, rhm.get(newRand)+1);
            } else {
                rhm.put(newRand, 1);
            }
        }
        for (Integer key: rhm.keySet()) {
            System.out.println("Name(key) = "+key+"\t"+rhm.get(key));
        }
    }
}
