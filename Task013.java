package Java_GB;

//Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task013 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        List<String> planets = Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Меркурий", "Венера", "Земля", "Марс", "Юпитер");
        List<String> planets = new ArrayList<String>() {{
            add("Mercury");
            add("Venera");
            add("Earth");
            add("Mars");
            add("Jupiter");
            add("Saturn");
            add("Uran");
            add("Neptun");
            add("Earth");
            add("Mars");
            add("Pluto");
        }};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(3, 6));
        }
        list.sort(null);
        list.sort(Collections.reverseOrder());
        System.out.println(list.toString());

        Map<String, Integer> planetCount = new HashMap<>();
        for (String planet : planets) {
            planetCount.put(planet, planetCount.getOrDefault(planet, 0) + 1);
        }

        System.out.println(planetCount.toString());
        Set<String> uniquePlanets = new LinkedHashSet<>(planets);
        System.out.println(uniquePlanets);

        countPlanet(planets);
    }

    private static void countPlanet(List<String> planets) {
        List<String> countPlanet = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (String planet : planets) {
            if (!countPlanet.contains(planet)) {
                countPlanet.add(planet);
                int count = 0;
                for (int i = 0; i < planets.size(); i++) {
                    String currentPlanet = planets.get(i);
                    if (planet.equals(currentPlanet)) {
                        count++;
                    }
                }

                builder.append(planet + ":" + count + ", ");
            }
        }
        System.out.println(builder);
    }

}
