package lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаём 2 списка
        ArrayList<String> solarSystem1 = new ArrayList<>(
                Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
        List<String> solarSystem2 = Collections.unmodifiableList(new ArrayList<>( // не модифицируемый список
                Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")));
        System.out.println(solarSystem1);
        System.out.println(solarSystem2);
        // Добавляем новый элемент в список
        solarSystem1.add("NewPlanet");
        System.out.println(solarSystem1);
        // Удаляем элемент из списка
        solarSystem1.remove("NewPlanet");
        System.out.println(solarSystem1);
        // Изменяем элемент списка
        for (ListIterator<String> iterator = solarSystem1.listIterator(); iterator.hasNext(); iterator.next()) {
            if (iterator.next().equals("Earth")) {
                iterator.set("Zemlya");
                break;
            }
        }
        System.out.println(solarSystem1);
        // Перемешиваем элементы списка
        Collections.shuffle(solarSystem1);
        System.out.println(solarSystem1);
        // Выбираем случайный элемент списка
        Collections.shuffle(solarSystem1);
        System.out.println(solarSystem1.get(0));
        // Узнаём индекс элемента в списке
        System.out.println(solarSystem1);
        System.out.println(solarSystem1.indexOf("Zemlya"));
        // Проверяем есть ли элемент в списке
        System.out.println(solarSystem1);
        System.out.println(solarSystem1.contains("NewPlanet"));
        System.out.println(solarSystem1.contains("Zemlya"));
        // Меняем местами элементы в списке
        System.out.println(solarSystem1);
        Collections.swap(solarSystem1, solarSystem1.indexOf("Neptune"), solarSystem1.indexOf("Uranus"));
        System.out.println(solarSystem1);
        // Сортируем элементы в списке
        System.out.println(solarSystem1);
        Collections.sort(solarSystem1);
        System.out.println(solarSystem1);
    }
}
