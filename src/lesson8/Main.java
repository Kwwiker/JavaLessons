package lesson8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");

        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList(earth, mars, jupiter));
        System.out.println(Collections.disjoint(solarSystem1, solarSystem2));
        //List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter)));
        //ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter));
        //Collections.sort(solarSystem);
        //System.out.println(solarSystem);
        //Collections.reverse(solarSystem);
        //System.out.println(solarSystem);
        //Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(jupiter));
        //System.out.println(solarSystem);
    }
}
